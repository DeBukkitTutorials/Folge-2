package me.mariuslange.tutorial;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin 
{
	@Override
	public void onEnable()
	{
		System.out.println("Das Plugin wurde erfolgreich geladen!");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		if(cmd.getName().equalsIgnoreCase("tutorial"))
		{
			sender.sendMessage("Du hast den Befehl /tutorial eingegeben!");
		}
		return true;
	}
}
