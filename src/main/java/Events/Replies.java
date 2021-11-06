package Events;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Replies extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent e){
        String[] args = e.getMessage().getContentRaw().split(" ");
        String name = "<@"+e.getMember().getUser().getId()+">";
        if(args[0].equalsIgnoreCase("hi")){
            if(!e.getMember().getUser().isBot()){
                e.getChannel().sendMessage("hello, u r gay " + name).queue();
            }}
            if(args[0].equalsIgnoreCase("hello")){
                if(!e.getMember().getUser().isBot()){
                    e.getChannel().sendMessage("hi, u r gay " + name).queue();
                }
        }
        if(args[0].equalsIgnoreCase("n1")){
            if(!e.getMember().getUser().isBot()){
                e.getChannel().sendMessage("wkr?" + name).queue();
            }}
            if(args[0].equalsIgnoreCase("f")){
                if(!e.getMember().getUser().isBot()){
                    e.getChannel().sendMessage("F " ).queue();
                }
    }
}}

