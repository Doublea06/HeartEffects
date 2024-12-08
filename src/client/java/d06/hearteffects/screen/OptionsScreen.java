package d06.hearteffects.screen;

import d06.hearteffects.HeartEffects;
import d06.hearteffects.HeartEffectsClient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.awt.*;

public class OptionsScreen extends Screen {
    private static final MinecraftClient client = MinecraftClient.getInstance();

    public OptionsScreen(Text title) {
        super(title);
    }

    @Override
    protected void init() {
        if (HeartEffectsClient.CONFIG.enabled()) {
            ButtonWidget enableMod = ButtonWidget.builder(Text.of("Disable mod"), (btn) -> {
                HeartEffectsClient.CONFIG.enabled(false);
            }).dimensions(client.getWindow().getScaledWidth() / client.getWindow().getScaledWidth() + 40, client.getWindow().getScaledHeight() / client.getWindow().getScaledHeight() + 100, 120, 20).build();
            this.addSelectableChild(enableMod);
        } else if (!HeartEffectsClient.CONFIG.enabled()) {
            ButtonWidget enableMod = ButtonWidget.builder(Text.of("Enable mod"), (btn) -> {
                HeartEffectsClient.CONFIG.enabled(true);
            }).dimensions(client.getWindow().getScaledWidth() / client.getWindow().getScaledWidth() + 40, client.getWindow().getScaledHeight() / client.getWindow().getScaledHeight() + 100, 120, 20).build();
            this.addSelectableChild(enableMod);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        context.drawTexture(Identifier.of(HeartEffects.MOD_ID, "textures/gui/sprites/screen/options/enable.png"), client.getWindow().getScaledWidth() / client.getWindow().getScaledWidth() + 40, client.getWindow().getScaledHeight() / client.getWindow().getScaledHeight() + 100, 0, 0, 120, 20, 120, 20);
        context.drawText(this.textRenderer, "Heart Effects", client.getWindow().getScaledWidth() / client.getWindow().getScaledWidth() + 40, client.getWindow().getScaledHeight() / client.getWindow().getScaledHeight() + 40, 0xFFFFFF, true);
    }
}
