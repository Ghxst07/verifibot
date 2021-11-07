package Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class Meme extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        String[]args=event.getMessage().getContentRaw().split(" ");
        JSONParser parser = new JSONParser();
        String postLink = "",title="",url="";

        if (args[0].equalsIgnoreCase("v.meme")){
            try {
                URL memeURL = new URL("https://meme-api.herokuapp.com/gimme");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(memeURL.openConnection().getInputStream()));
                String lines;
                while((lines = bufferedReader.readLine())!=null)
                {
                    JSONArray array = new JSONArray();
                    array.add(parser.parse(lines));
                    for(Object o:array){
                        JSONObject jsObject = (JSONObject) o;
                     postLink=(String) jsObject.get("postLink");
                     title=(String) jsObject.get("title");
                     url=(String) jsObject.get("url");



                    }
                }
                bufferedReader.close();

                event.getMessage().delete().queue();
                EmbedBuilder builder = new EmbedBuilder().setTitle(title,postLink).setImage(url).setColor(Color.BLUE);
                event.getChannel().sendMessage(builder.build()).queue();
            } catch (Exception e) {
                event.getChannel().sendMessage(":no_entry: Error, Try again Later <3").queue();
                e.printStackTrace();
            }

        }

    }
}
