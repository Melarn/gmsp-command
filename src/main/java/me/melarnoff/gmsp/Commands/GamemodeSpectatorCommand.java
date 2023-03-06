package me.melarnoff.gmsp.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GamemodeSpectatorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }

        Player player = (Player) sender;
        if (!player.hasPermission("gmsp.spectator")) {
            player.sendMessage("Чел, у тебя нет прав");
        } else
            if (player.getGameMode() == GameMode.SURVIVAL) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage("Ура спектатор");
            } else if (player.getGameMode() == GameMode.SPECTATOR) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("Ура выживание");
        }
        return true;
    }
}
