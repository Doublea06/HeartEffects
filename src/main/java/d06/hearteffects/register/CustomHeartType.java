package d06.hearteffects.register;

import d06.hearteffects.HeartEffects;
import d06.hearteffects.SizedTexture;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import org.lwjgl.opengl.GL;

public enum CustomHeartType {
    ABSORPTION(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/absorption_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/absorption_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/absorption_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/absorption_half_blinking"), 9, 9)),

    BAD_LUCK(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/badluck_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/badluck_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/badluck_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/badluck_half_blinking"), 9, 9)),

    BAD_OMEN(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/badomen_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/badomen_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/badomen_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/badomen_half_blinking"), 9, 9)),

    BLINDNESS(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/blindness_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/blindness_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/blindness_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/blindness_half_blinking"), 9, 9)),

    CONDUIT_POWER(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/conduit_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/conduit_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/conduit_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/conduit_half_blinking"), 9, 9)),

    DARKNESS(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/darkness_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/darkness_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/darkness_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/darkness_half_blinking"), 9, 9)),

    DOLPHIN_GRACE(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/dolphin_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/dolphin_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/dolphin_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/dolphin_half_blinking"), 9, 9)),

    FIRE_RESISTANCE(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/fireresistance_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/fireresistance_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/fireresistance_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/fireresistance_half_blinking"), 9, 9)),

    GLOWING(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/glowing_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/glowing_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/glowing_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/glowing_half_blinking"), 9, 9)),

    HERO_OF_THE_VILLAGE(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/hero_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/hero_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/hero_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/hero_half_blinking"), 9, 9)),

    INFESTED(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/infested_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/infested_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/infested_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/infested_half_blinking"), 9, 9)),

    INVISIBILITY(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/invisibility_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/invisibility_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/invisibility_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/invisibility_half_blinking"), 9, 9)),

    JUMP_BOOST(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/jump_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/jump_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/jump_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/jump_half_blinking"), 9, 9)),

    LEVITATION(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/levitation_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/levitation_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/levitation_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/levitation_half_blinking"), 9, 9)),

    LUCK(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/luck_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/luck_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/luck_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/luck_half_blinking"), 9, 9)),

    MINING_FATIGUE(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/fatigue_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/fatigue_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/fatigue_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/fatigue_half_blinking"), 9, 9)),

    NIGHT_VISION(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/night_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/night_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/night_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/night_half_blinking"), 9, 9)),

    OOZING(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/oozing_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/oozing_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/oozing_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/oozing_half_blinking"), 9, 9)),

    RESISTANCE(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/resistance_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/resistance_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/resistance_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/resistance_half_blinking"), 9, 9)),

    SLOW_FALLING(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/slowfall_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/slowfall_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/slowfall_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/slowfall_half_blinking"), 9, 9)),

    SLOWNESS(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/slowness_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/slowness_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/slowness_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/slowness_half_blinking"), 9, 9)),

    SPEED(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/speed_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/speed_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/speed_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/speed_half_blinking"), 9, 9)),

    STRENGTH(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/strength_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/strength_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/strength_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/strength_half_blinking"), 9, 9)),

    WATER_BREATHING(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/water_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/water_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/water_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/water_half_blinking"), 9, 9)),

    WEAKNESS(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/weakness_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/weakness_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/weakness_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/weakness_half_blinking"), 9, 9)),

    WEAVING(new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/weaving_full"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/weaving_full_blinking"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/weaving_half"), 9, 9),
            new SizedTexture(Identifier.of(HeartEffects.MOD_ID, "hud/heart/weaving_half_blinking"), 9, 9));

    private final SizedTexture fullTexture;
    private final SizedTexture fullBlinkingTexture;
    private final SizedTexture halfTexture;
    private final SizedTexture halfBlinkingTexture;

    CustomHeartType(SizedTexture fullTexture, SizedTexture fullBlinkingTexture, SizedTexture halfTexture, SizedTexture halfBlinkingTexture) {
        this.fullTexture = fullTexture;
        this.fullBlinkingTexture = fullBlinkingTexture;
        this.halfTexture = halfTexture;
        this.halfBlinkingTexture = halfBlinkingTexture;
    }

    public SizedTexture getTexture(boolean hardcore, boolean half, boolean blinking) {
        if (half) {
            return blinking ? this.halfBlinkingTexture : this.halfTexture;
        }
        return blinking ? this.fullBlinkingTexture : this.fullTexture;
    }

    public static CustomHeartType fromPlayerState(PlayerEntity player) {
        return (player.hasStatusEffect(StatusEffects.ABSORPTION)) ? ABSORPTION :
                (player.hasStatusEffect(StatusEffects.UNLUCK)) ? BAD_LUCK :
                        (player.hasStatusEffect(StatusEffects.BAD_OMEN)) ? BAD_OMEN :
                                (player.hasStatusEffect(StatusEffects.RAID_OMEN)) ? BAD_OMEN :
                                        (player.hasStatusEffect(StatusEffects.TRIAL_OMEN)) ? BAD_OMEN :
                                                (player.hasStatusEffect(StatusEffects.BLINDNESS)) ? BLINDNESS :
                                                        (player.hasStatusEffect(StatusEffects.CONDUIT_POWER)) ? CONDUIT_POWER :
                                                                (player.hasStatusEffect(StatusEffects.DARKNESS)) ? DARKNESS :
                                                                        (player.hasStatusEffect(StatusEffects.DOLPHINS_GRACE)) ? DOLPHIN_GRACE :
                                                                                (player.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) ? FIRE_RESISTANCE :
                                                                                        (player.hasStatusEffect(StatusEffects.GLOWING)) ? GLOWING :
                                                                                            (player.hasStatusEffect(StatusEffects.HERO_OF_THE_VILLAGE)) ? HERO_OF_THE_VILLAGE :
                                                                                                    (player.hasStatusEffect(StatusEffects.INFESTED)) ? INFESTED :
                                                                                                            (player.hasStatusEffect(StatusEffects.INVISIBILITY)) ? INVISIBILITY :
                                                                                                                    (player.hasStatusEffect(StatusEffects.JUMP_BOOST)) ? JUMP_BOOST :
                                                                                                                            (player.hasStatusEffect(StatusEffects.LEVITATION)) ? LEVITATION :
                                                                                                                                    (player.hasStatusEffect(StatusEffects.LUCK)) ? LUCK :
                                                                                                                                            (player.hasStatusEffect(StatusEffects.MINING_FATIGUE)) ? MINING_FATIGUE :
                                                                                                                                                    (player.hasStatusEffect(StatusEffects.NIGHT_VISION)) ? NIGHT_VISION :
                                                                                                                                                            (player.hasStatusEffect(StatusEffects.OOZING)) ? OOZING :
                                                                                                                                                                    (player.hasStatusEffect(StatusEffects.RESISTANCE)) ? RESISTANCE :
                                                                                                                                                                            (player.hasStatusEffect(StatusEffects.SLOW_FALLING)) ? SLOW_FALLING :
                                                                                                                                                                                    (player.hasStatusEffect(StatusEffects.WIND_CHARGED)) ? SLOW_FALLING :
                                                                                                                                                                                        (player.hasStatusEffect(StatusEffects.SLOWNESS)) ? SLOWNESS :
                                                                                                                                                                                                (player.hasStatusEffect(StatusEffects.SPEED)) ? SPEED :
                                                                                                                                                                                                        (player.hasStatusEffect(StatusEffects.STRENGTH)) ? STRENGTH :
                                                                                                                                                                                                                (player.hasStatusEffect(StatusEffects.WATER_BREATHING)) ? WATER_BREATHING :
                                                                                                                                                                                                                        (player.hasStatusEffect(StatusEffects.WEAKNESS)) ? WEAKNESS :
                                                                                                                                                                                                                                (player.hasStatusEffect(StatusEffects.WEAVING)) ? WEAVING : null;
    }
}
