package org.botapi.listener;


import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.botapi.service.CatsService;
import org.jetbrains.annotations.NotNull;

public class BotListeners extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        CatsService catsService = new CatsService();
        System.out.println(event.getMessage().getContentRaw());

        try {
            if ( !event.getAuthor().isBot() && event.isFromGuild())  {
                String image = catsService.generateCatImage().toString();
                event.getTextChannel().sendMessage(image).queue();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try{
            if(!event.getAuthor().isBot() && event.getMessage().getContentRaw().equalsIgnoreCase("test")) {
                String image = catsService.generateCatImage().toString();
                event.getPrivateChannel().sendMessage(image).queue();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
