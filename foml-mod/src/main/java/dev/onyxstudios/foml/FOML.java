package dev.onyxstudios.foml;

import dev.onyxstudios.foml.obj.OBJLoader;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FOML implements ClientModInitializer {
    public static final String MODID = "foml";
    public static Logger LOGGER = LogManager.getLogger("FOML");

    @Override
    public void onInitializeClient() {
        ModelLoadingPlugin.register(OBJLoader.INSTANCE);
    }
}
