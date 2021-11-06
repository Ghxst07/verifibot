package Filter;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class FilterOnOff extends ListenerAdapter {


    public static boolean filteron = true;

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent e) {
        String Member = "<@"+e.getMember().getUser().getId()+">";
        if(e.getMessage().getContentRaw().equalsIgnoreCase("v.togglefilter")&&filteron) {
            filteron = false;
            e.getChannel().sendMessage("The Curse Filter has been disabled by "+Member).queue();
        }
        else if(e.getMessage().getContentRaw().equalsIgnoreCase("v.togglefilter")&&! filteron)
        {   filteron = true;
            e.getChannel().sendMessage("The Curse Filter has been enabled by "+Member).queue();
        }
    }
}
