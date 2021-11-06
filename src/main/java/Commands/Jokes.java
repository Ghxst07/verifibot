package Commands;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Jokes extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String[] args = e.getMessage().getContentRaw().split(" ");
        if(args[0].equalsIgnoreCase("v.jokes")){
            int i = 0, j = 16, k = (int) Math.floor(Math.random() * (j - i + 1) + i);
            switch (k) {
                case 1:
                    e.getChannel().sendMessage("What's the best thing about Switzerland?\n I don't know, but the flag is a big plus.\n").queue();
                    break;
                case 2:
                    e.getChannel().sendMessage("I invented a new word!\n" +
                            "Plagiarism!").queue();
                    break;
                case 3:
                    e.getChannel().sendMessage("Did you hear about the mathematician who's afraid of negative numbers?\n" +
                            "He'll stop at nothing to avoid them.").queue();
                    break;
                case 4:
                    e.getChannel().sendMessage("Why do we tell actors to 'break a leg?'\n" +
                            "Because every play has a cast.").queue();
                    break;
                case 5:
                    e.getChannel().sendMessage("Helvetica and Times New Roman walk into a bar.\n" +
                            "'Get out of here!' shouts the bartender. 'We don't serve your type.'").queue();
                    break;
                case 6:
                    e.getChannel().sendMessage("Knock! Knock!\n" +
                            "Who's there?\n" +
                            "Control Freak.\n" +
                            "Con...\n" +
                            "OK, now you say, 'Control Freak who?' ").queue();
                    break;
                case 7:
                    e.getChannel().sendMessage("Hear about the new restaurant called Karma?\n" +
                            "There's no menu: You get what you deserve.").queue();
                    break;
                case 8:
                    e.getChannel().sendMessage("A woman in labor suddenly shouted, 'Shouldn't! Wouldn't! Couldn't! Didn't! Can't!\n" +
                            "'Don't worry,' said the doc. 'Those are just contractions.'").queue();
                    break;
                case 9:
                    e.getChannel().sendMessage("A bear walks into a bar and says, 'Give me a whiskey and ... cola.'\n" +
                            "'Why the big pause?' asks the bartender. The bear shrugged. 'I'm not sure; I was born with them.'").queue();
                    break;
                case 10:
                    e.getChannel().sendMessage("Did you hear about the actor who fell through the floorboards?\n" +
                            "He was just going through a stage.").queue();
                    break;
                case 11:
                    e.getChannel().sendMessage("Did you hear about the claustrophobic astronaut?\n" +
                            "He just needed a little space.").queue();
                    break;
                case 12:
                    e.getChannel().sendMessage("Why don't scientists trust atoms?\n" +
                            "Because they make up everything.").queue();
                    break;
                case 13:
                    e.getChannel().sendMessage("Why did the chicken go to the seance?\n" +
                            "To get to the other side.").queue();
                    break;
                case 14:
                    e.getChannel().sendMessage("Where are average things manufactured?\n" +
                            "The satisfactory.").queue();
                    break;
                case 15:
                    e.getChannel().sendMessage("How do you drown a hipster?\n" +
                            "Throw him in the mainstream.").queue();
                    break;
                default:
                    e.getChannel().sendMessage("What does a nosy pepper do?\n" +
                            "Gets jalapeno business!").queue();
            }
        }




    }
}