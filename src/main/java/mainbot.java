import Commands.Commands;
import Commands.Jokes;
import Commands.Meme;
import Commands.Roast;
import Events.PingPong;
import Events.Replies;
import Filter.Filter;
import Filter.FilterOnOff;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;


public class mainbot {

    public static void main(String[]args) throws Exception{


        JDA jda= JDABuilder.createDefault("ODUxMzg3OTI3NDgwODkzNDQw.YL3iyw.VLUmKR-nYqcbgE4RgflCs2ragcc").build();
        jda.addEventListener(new PingPong());
        jda.addEventListener(new Replies());
        jda.addEventListener(new Commands());
        jda.addEventListener(new Roast());
        jda.addEventListener(new Meme());
        jda.addEventListener(new Jokes());
        jda.addEventListener(new Filter());
        jda.addEventListener(new FilterOnOff());


    }
}
