package d06.hearteffects.mixin.client;

import d06.hearteffects.HeartEffectsClient;
import d06.hearteffects.SizedTexture;
import d06.hearteffects.register.CustomHeartType;
import net.minecraft.client.MinecraftClient;
import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(InGameHud.class)
public class InGameHudMixin {
    @Final
    @Shadow
    private MinecraftClient client;

    @Inject(method = "drawHeart", at = @At("HEAD"), cancellable = true)
    private void hearteffects$drawCustomHeart(DrawContext context, InGameHud.HeartType type, int x, int y, boolean hardcore,
                                     boolean blinking, boolean half, CallbackInfo ci) {
        assert this.client.player != null;
        CustomHeartType customType = CustomHeartType.fromPlayerState(this.client.player);

        if (HeartEffectsClient.CONFIG.enabled()) {
            if (type == InGameHud.HeartType.NORMAL && customType != null) {
                SizedTexture texture = customType.getTexture(hardcore, half, blinking);

                int yOffset = 9 - texture.height;

                RenderSystem.enableBlend();
                context.drawGuiTexture(texture.id, x, y + yOffset, texture.width, texture.height);
                RenderSystem.disableBlend();

                ci.cancel();
            }
        }
    }
}
