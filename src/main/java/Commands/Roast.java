package Commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Roast extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

        String[] message = e.getMessage().getContentRaw().split(" ");
        if(message[0].equalsIgnoreCase("v.roast")) {
            int i = 0, j = 16, k = (int) Math.floor(Math.random() * (j - i + 1) + i);
            switch (k) {
                case 1:
                    e.getChannel().sendMessage("Your teeth are so bad that you could eat an apple through a fence.\n").queue();
                    break;
                case 2:
                    e.getChannel().sendMessage("I'm not insulting you; I'm describing you.").queue();
                    break;
                case 3:
                    e.getChannel().sendMessage("I'm not a nerd; I'm just smarter than you.").queue();
                    break;
                case 4:
                    e.getChannel().sendMessage("Don't be ashamed of who you are. That's your parents' job.").queue();
                    break;
                case 5:
                    e.getChannel().sendMessage("Your face is just fine, but we'll have to put a bag over that personality.").queue();
                    break;
                case 6:
                    e.getChannel().sendMessage("You bring everyone so much joy… when you leave the room.").queue();
                    break;
                case 7:
                    e.getChannel().sendMessage("I thought of you today. It reminded me to take out the trash.").queue();
                    break;
                case 8:
                    e.getChannel().sendMessage("Don't worry about me. Worry about your eyebrows.").queue();
                    break;
                case 9:
                    e.getChannel().sendMessage("If you're going to be two-faced, at least make one of them pretty.").queue();
                    break;
                case 10:
                    e.getChannel().sendMessage("You are like a cloud. When you disappear, it's a beautiful day.\n").queue();
                    break;
                case 11:
                    e.getChannel().sendMessage("I'd rather treat my baby's diaper rash than have lunch with you.").queue();
                    break;
                case 12:
                    e.getChannel().sendMessage(" Don't worry — the first 40 years of childhood are always the hardest.").queue();
                    break;
                case 13:
                    e.getChannel().sendMessage("I love what you've done with your hair. How do you get it to come out of your nostrils like that?").queue();
                    break;
                case 14:
                    e.getChannel().sendMessage("OH MY GOD! IT SPEAKS!").queue();
                    break;
                case 15:
                    e.getChannel().sendMessage("'Check your lipstick before you come for me.' — Naomi Smalls, RuPaul’s Drag Race").queue();
                    break;
                default:
                    e.getChannel().sendMessage("I guess if you actually ever spoke your mind, you'd really be speechless.").queue();
            }
        }

    }
}