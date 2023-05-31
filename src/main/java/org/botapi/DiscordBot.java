package org.botapi;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.botapi.listener.BotListeners;


public class DiscordBot extends ListenerAdapter  {
    public static void main(String[] args) throws Exception {

        Dotenv dotenv = Dotenv.configure().load();
        String token = dotenv.get("TOKEN");

        JDA bot = JDABuilder.createDefault (token).enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .setActivity(Activity.watching("Say !cat or !dog to a surprise! "))
                .addEventListeners(new BotListeners()).build().awaitReady();

    }

}

