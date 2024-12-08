package d06.hearteffects.util;

import blue.endless.jankson.Jankson;
import io.wispforest.owo.config.ConfigWrapper;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.util.Observable;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class HeartEffectsConfig extends ConfigWrapper<d06.hearteffects.util.HeartEffectsConfigModel> {

    public final Keys keys = new Keys();

    private final Option<java.lang.Boolean> enabled = this.optionForKey(this.keys.enabled);

    private HeartEffectsConfig() {
        super(d06.hearteffects.util.HeartEffectsConfigModel.class);
    }

    private HeartEffectsConfig(Consumer<Jankson.Builder> janksonBuilder) {
        super(d06.hearteffects.util.HeartEffectsConfigModel.class, janksonBuilder);
    }

    public static HeartEffectsConfig createAndLoad() {
        var wrapper = new HeartEffectsConfig();
        wrapper.load();
        return wrapper;
    }

    public static HeartEffectsConfig createAndLoad(Consumer<Jankson.Builder> janksonBuilder) {
        var wrapper = new HeartEffectsConfig(janksonBuilder);
        wrapper.load();
        return wrapper;
    }

    public boolean enabled() {
        return enabled.value();
    }

    public void enabled(boolean value) {
        enabled.set(value);
    }


    public static class Keys {
        public final Option.Key enabled = new Option.Key("enabled");
    }
}

