package d06.hearteffects;

import d06.hearteffects.util.HeartEffectsConfig;
import net.fabricmc.api.ClientModInitializer;

public class HeartEffectsClient implements ClientModInitializer {
	public static final HeartEffectsConfig CONFIG = HeartEffectsConfig.createAndLoad();
	@Override
	public void onInitializeClient() {
		HeartEffects.LOGGER.info("Hello world from HeartEffects!");
	}
}