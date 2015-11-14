package danielm59.deathlog.proxy;

import java.io.IOException;

import cpw.mods.fml.server.FMLServerHandler;
import net.minecraft.server.MinecraftServer;

public class ServerProxy extends CommonProxy
{

	@Override
	public void loadTextures()
	{

	}

	@Override
	public String getLogPath() throws IOException
	{
		MinecraftServer server = FMLServerHandler.instance().getServer();
		String worldName = (server != null) ? server.getFolderName() : "world";
		return FMLServerHandler.instance().getSavesDirectory() + "/" + worldName
				+ "/DeathLog/log.dat";
	}
}
