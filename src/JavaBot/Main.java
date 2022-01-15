package JavaBot;

import JavaBot.Events.Commands;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException, InterruptedException {
        JDABuilder jda = JDABuilder.createDefault(Token.DiscordToken());
        jda.setActivity(Activity.playing("Currently testing the bot in Java (For the time being ganti nama dulu KEKW)"));
        jda.setStatus(OnlineStatus.DO_NOT_DISTURB);
        jda.addEventListeners(new Commands());
        jda.setChunkingFilter(ChunkingFilter.ALL);
        jda.setMemberCachePolicy(MemberCachePolicy.ALL);
        jda.enableIntents(GatewayIntent.GUILD_MEMBERS);
        jda.build();
        Thread.sleep(5000);
        System.out.println("The bot is now online");
    }
}
