package d06.hearteffects.util;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.annotation.Config;

@Config(name = "HeartEffectsConfig", wrapperName = "HeartEffectsConfig")
public class HeartEffectsConfigModel {
    @Comment("Enables or disables mod")
    public boolean enabled = true;
}
