package Filter;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public class Filter extends ListenerAdapter {


    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent e) {
        if(FilterOnOff.filteron) {

            String[] LIST_OF_BADWORDS = {"fuck", "motherfucker", "asshole","hoe","whore","bitch","anal"};
            String[] messages = e.getMessage().getContentRaw().split(" ");
            for (String message : messages) {

                for (String list_of_badword : LIST_OF_BADWORDS) {
                    if (message.equalsIgnoreCase(list_of_badword)) {
                        e.getMessage().delete().queue();
                        e.getChannel().sendMessage("Get a life"+ "<@"+e.getMember().getUser().getId()+">").queue();


                    }
                }

            }
        }






    }
}

