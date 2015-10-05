package danielm59.deathlog.client.gui.log.states;

import net.minecraft.client.gui.GuiButton;
import danielm59.deathlog.client.gui.log.GuiDeathLog;
import danielm59.deathlog.handler.LogHandler;
import danielm59.deathlog.reference.LogGuiStates;

public class GuiStateCount extends BaseGuiState
{

	public GuiStateCount(GuiDeathLog log)
	{
		super(log);
	}

	@Override
	public void drawText()
	{
		int i = 1;
		for (String player : LogHandler.getPlayers("COUNT"))
		{
			log.font().drawString(
					player + " : " + LogHandler.getDeaths(player, "COUNT"),
					log.getLeft() + 18, log.getTop() + 14 + (12 * i), 0x000000);
			i++;
		}
	}

	@Override
	protected void addButtons()
	{
		log.addButton(new GuiButton(0, log.getLeft() + 18, log.getTop() + 145,
				110, 20, "Back"));
	}

	@Override
	public void buttonClick(int buttonID)
	{
		switch (buttonID)
		{
		case 0:
			log.SetGuiState(LogGuiStates.MENU);
			break;
		}
	}

	@Override
	public void init()
	{
		page = 1;
		addButtons();
	}
}