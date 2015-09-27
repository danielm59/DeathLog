package danielm59.deathlog.client.gui.log.states;

import net.minecraft.client.gui.GuiButton;
import danielm59.deathlog.client.gui.log.GuiDeathLog;
import danielm59.deathlog.handler.LogHandler;
import danielm59.deathlog.reference.LogGuiStates;

public class GuiStateType extends BaseGuiState
{

	public GuiStateType(GuiDeathLog log)
	{
		super(log);
	}

	@Override
	public void drawText()
	{
		int i = 1;
		for (String player : LogHandler.getPlayers(log.getDeathType()))
		{
			log.font().drawString(
					player + " : " + LogHandler.getDeaths(player, log.getDeathType()),
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
			log.SetGuiState(LogGuiStates.TYPE_MENU);
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
