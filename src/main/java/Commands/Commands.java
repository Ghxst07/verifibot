package Commands;

import net.dv8tion.jda.api.JDAInfo;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

        String[] message = e.getMessage().getContentRaw().split(" ");

        if(message.length == 1 && message[0].equalsIgnoreCase("v.info")) {
            e.getChannel().sendMessage("Hello! I'm **VerifiBot**, and I'm here to make it as easy as possible to have \n" + " fun on your Discord server! \n I was created by **ghXst**#6997"+"(<@579938916690296852>) using the [JDA] library ("+JDAInfo.VERSION+") " + " Check out my " + "commands by typing v.help`, and checkout my website at **https://verifi.rainboestrykr.repl.co/**\n Add me using this link for some 6 digit codes : **https://discord.com/api/oauth2/authorize?client_id=851387927480893440&permissions=8&scope=bot** ;)").queue();
        }
        if(message.length == 1 && message[0].equalsIgnoreCase("v.help")) {
            e.getChannel().sendMessage("Hello! I'm **VerifiBot**, here to help you \n" + " Find a simple PING_PONG :ping_pong: command by '**v.ping**'  \n Use '**v.info**' to know about the bot  " + "\n Other commands are: \n **v.roast** - To Roast \n **v.meme** - For Memes").queue();
        }

    }}