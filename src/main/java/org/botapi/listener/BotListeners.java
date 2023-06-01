package org.botapi.listener;


import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.botapi.service.CatsService;
import org.botapi.service.DogsService;
import org.jetbrains.annotations.NotNull;

public class BotListeners extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        CatsService catsService = new CatsService();
        DogsService dogsService = new DogsService();

        boolean compare = !event.getAuthor().isBot() && event.isFromGuild();
        boolean isCat = event.getMessage().getContentRaw().equalsIgnoreCase("!cat");
        boolean isDog = event.getMessage().getContentRaw().equalsIgnoreCase("!dog");

        try {
            if (compare && isCat) {
                catsService.generateCatImage();
                System.out.println(catsService.generateCatImage());
            } else if (compare && isDog)
                dogsService.generateDogImage();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            if (!event.getAuthor().isBot() && isCat) {
                event.getChannel().sendMessage(catsService.generateCatImage().toString()).queue();
            } else if (!event.getAuthor().isBot() && isDog)
                event.getChannel().sendMessage(dogsService.generateDogImage().toString()).queue();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
