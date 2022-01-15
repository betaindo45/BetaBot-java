package JavaBot.Events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Random;

public class Commands extends ListenerAdapter {
    public String prefix = "b.";
    public Random rnd = new Random();
    public void onGuildMessageReceived(GuildMessageReceivedEvent input){
        EmbedBuilder embed = new EmbedBuilder();

        String[] args = input.getMessage().getContentRaw().split(" ");
        String rawInput = input.getMessage().getContentRaw().toLowerCase();

        if (args[0].equalsIgnoreCase(prefix + "about")){

            embed.setTitle("About BetaMusicBot");
            embed.setThumbnail("https://cdn.discordapp.com/avatars/887710788658270259/67fbdbc856371011ff25561110ccf5a7.png?size=256");
            embed.setColor(Color.CYAN);
            embed.setDescription("A not so interesting bot");
            embed.addField("Java Version:","OpenJDK 1.8", false);
            embed.setFooter("A Bot By BetaIndo#4099", "https://images-ext-2.discordapp.net/external/TivNmzC_WxIJgIR8xumWWl0CR6OK3aj6G0cNDxtgDAU/%3Fsize%3D2048/https/cdn.discordapp.com/avatars/399829927261896715/164d1b969c5bd09868e5779f4bfeebf5.png");
            input.getChannel().sendMessage(embed.build()).queue();
            embed.clear();
        }else if (args[0].equalsIgnoreCase(prefix + "kesukaanangel")){
            if (args.length>1){
                input.getChannel().sendMessage(args[1] + "\n https://media.discordapp.net/attachments/607152667466137620/914146504552382474/kesukaanangel.jpeg").queue();
            } else{
                input.getChannel().sendMessage("https://media.discordapp.net/attachments/607152667466137620/914146504552382474/kesukaanangel.jpeg").queue();
            }
        }else if (args[0].equalsIgnoreCase(prefix + "help")){
            embed.setTitle("Commands list");
            embed.setColor(Color.CYAN);
            embed.setDescription("b.about \nb.choose \nb.help \nb.hentai (Do it at your own risk) \nb.suisei");
            embed.setFooter("A Bot By BetaIndo#4099", "https://images-ext-2.discordapp.net/external/TivNmzC_WxIJgIR8xumWWl0CR6OK3aj6G0cNDxtgDAU/%3Fsize%3D2048/https/cdn.discordapp.com/avatars/399829927261896715/164d1b969c5bd09868e5779f4bfeebf5.png");
            input.getChannel().sendMessage(embed.build()).queue();
            embed.clear();
        }else if (args[0].equalsIgnoreCase(prefix + "choose")){
            String[] choice = {"",""};
            int random2 = rnd.nextInt(2);
            int j = 0;
            for (int i = 1; i < args.length; i++) {
                if (args[i].equals("|")){
                    j++;
                    continue;
                }
                choice[j] = choice [j] + args[i] + " ";
            }
            choice[0] = choice[0].toLowerCase();
            choice[1] =  choice[1].toLowerCase();
            if (random2 % 2==0){
                input.getChannel().sendMessage("The bot choose " + choice[0]).queue();
            }else{
                input.getChannel().sendMessage("The bot choose " + choice [1]).queue();
            }
        }else if(args[0].equalsIgnoreCase(prefix + "test")){
            input.getChannel().sendMessage("<:JadiGini:908006683375198280>").queue();
        }else if(args[0].equalsIgnoreCase(prefix+"test2")){
            input.getMessage().addReaction("🥵").queue();
        }else if(rawInput.contains("no")){

            int random = rnd.nextInt(1000);
            if (random % 5 == 0){
                input.getMessage().addReaction("🧯").queue();
            }else if (random % 3 == 0){
                input.getMessage().addReaction(":KEKW:792361008240132136").queue();
            }else if (random % 7 == 0) {
                input.getMessage().addReaction("\uD83C\uDDF7").queue();
                input.getMessage().addReaction("\uD83C\uDDE6").queue();
                input.getMessage().addReaction("\uD83C\uDDF9").queue();
                input.getMessage().addReaction("\uD83C\uDDEE").queue();
                input.getMessage().addReaction("\uD83C\uDDF4").queue();
            }else if(random % 11 == 0){
                input.getMessage().addReaction("☠️").queue();
            }else if (random % 13 == 0){
                input.getMessage().addReaction("🥵").queue();
            }
        }else if(args[0].equalsIgnoreCase(prefix + "test3")){
            input.getMessage().addReaction(":JadiGini:908006683375198280").queue();
        }else if (args[0].equalsIgnoreCase(prefix + "suisei")){
            int random = rnd.nextInt(10);
            if (random%2 == 0){
                input.getChannel().sendMessage("SUISEI...........SUISEI SUISEI AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ❤️ ❤️ ❤️ WANGI WANGI WANGI WANGI HU HA HU HA HU HA, aaaah baunya SUISEI wangi aku mau nyiumin aroma wanginya SUISEI AAAAAAAAH ~ bibirnya.... aaah bibirnya juga pengen aku endus-endus ~~~~ AAAAAH SUISEI keluar pertama kali di panggung juga CANTIK BANGETTTT ❤️ ❤️ ❤️ suaranya dia itu juga CANTIK BANGET AAAAAAAAH SUISEI CANTIIIIIIIIIIIIIIIIIIIIIIIIIIIKKKKKKK............ ❤️ ❤️ ❤️ apa ? SUISEI itu gak nyata ? Cuma karakter 2 dimensi katamu ? nggak, ngak ngak ngak ngak NGAAAAAAAAK GUA GAK PERCAYA ITU DIA NYATA NGAAAAAAAAAAAAAAAAAK PEDULI BANGSAAAAAT !! GUA GAK PEDULI SAMA KENYATAAN POKOKNYA GAK PEDULI. ❤️ ❤️ ❤️ SUISEI ngeliat gw ... SUISEI di hp bicara am gw SUISEI... kamu percaya sama aku ? aaaaaaaaaaah syukur SUISEI gak mau merelakan aku AAAAAAHHHH ❤️ ❤️ ❤️ YEAAAAAAAAAAAH GUA MASIH PUNYA SUISEI, SENDIRI PUN NGGAK MASALAH AAAAAAAAAAAAAAH DRIIIIIII KIRIMKANLAH CINTAKU PADA SUISEI KIRIMKAN KE PANGGUNGNYA AAAAAAAAH ❤️ ❤️ ❤️").queue();
            }else{
                input.getChannel().sendMessage("https://cdn.discordapp.com/attachments/799767059235340290/925370415956766791/hoshimachisuisei-suisei.gif").queue();
            }
        }else if(args[0].equalsIgnoreCase(prefix + "test4")){
            input.getMessage().addReaction("\uD83C\uDDF7").queue();
            input.getMessage().addReaction("\uD83C\uDDE6").queue();
            input.getMessage().addReaction("\uD83C\uDDF9").queue();
            input.getMessage().addReaction("\uD83C\uDDEE").queue();
            input.getMessage().addReaction("\uD83C\uDDF4").queue();
        }else if(rawInput.contains("suisei")){
            input.getMessage().reply("<@399829927261896715> <@739875740245295244>").queue();
        }else if(args[0].equalsIgnoreCase(prefix +"hentai")){
            int verySus = rnd.nextInt(10);
            int GIF = rnd.nextInt();
            StringBuilder Code = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int tempCode;
                if (i == 0){
                    tempCode = rnd.nextInt(3);
                }else{
                    tempCode = rnd.nextInt(9);
                }
                String tempString = Integer.toString(tempCode);
                Code.append(tempString);
            }
            if (verySus < 7){
                input.getChannel().sendMessage("***HAYO MAU NGAPAIN***").queue();
                if (GIF % 2 == 0){
                    input.getChannel().sendMessage("https://tenor.com/view/paimon-genshin-impact-happy-anime-gacha-gif-18690587").queue();
                }else if (GIF % 3 == 0){
                    input.getChannel().sendMessage("https://media.discordapp.net/attachments/774193642797531166/924997513155604490/bruh.png").queue();
                }else{
                    input.getChannel().sendMessage("https://tenor.com/view/caught-in4k-waffle-wafflebeyyy-sam-quadfather-gif-22558875").queue();
                }
            }else if(verySus < 8){
                input.getChannel().sendMessage("don't care + didn't ask + cry about it + stay mad + get real + L + mald seethe cope harder + hoes mad + basic + skill issue + ratio + you fell off + the audacity + triggered + any askers + redpilled + get a life + ok and? + cringe + touch grass + donowalled + not based + not funny didn't laugh + you're* + grammar issue + go outside + get good + reported + ad hominem + ask deez + ez clap + straight cash + ratio again + final ratio + stay mad + stay pressed + pedophile + cancelled + done for + mad free + freer than air + rip bozo + cringe again + mad cuz bad + lol + irrelevant + cope + jealous + go ahead whine about it + your problem + don't care even more + sex offender + sex defender + not okay + glhf + problematic").queue();
            }else{
                input.getChannel().sendMessage("Congratulation you got the jackpot of a random code <:IP_geraldusus:772634287408152586> : " + Code).queue();

            }
        }else if (args[0].equalsIgnoreCase(prefix + "negiAlt")){
            input.getChannel().sendMessage("https://tenor.com/view/when-the-money-vince-mcmahon-big-chungus-wwe-gif-16018373").queue();
        }else if(args[0].equalsIgnoreCase("test")){
            input.getChannel().sendMessage("Hi <:NoelLurk:926062896121774130>").queue();
        }else if(args[0].equalsIgnoreCase("<:AA_Kanna_Fire:926682988484395059>") || args[0].equalsIgnoreCase(":AA_Kanna_Fire:") || args[0].equalsIgnoreCase("<:EZ:880783241450250260>") ){
            input.getMessage().addReaction("🧯").queue();
        }
    }
}
