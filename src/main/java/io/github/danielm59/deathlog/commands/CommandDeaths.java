package io.github.danielm59.deathlog.commands;

import io.github.danielm59.deathlog.handler.LogHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class CommandDeaths extends CommandBase
{

	@Override
	public String getCommandName()
	{
		return "deaths";
	}

	@Override
	public String getCommandUsage(ICommandSender sender)
	{
		return "/deaths";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] astring)
	{
		if (astring.length == 0)
		{
			LogHandler.deathsCommand(sender, sender.getName());
		} else
		{
			LogHandler.deathsCommand(sender, astring[0]);
		}
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender sender)
	{
		return true;
	}

}
