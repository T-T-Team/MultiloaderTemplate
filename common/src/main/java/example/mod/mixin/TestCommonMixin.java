package example.mod.mixin;

import example.mod.ExampleModConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class TestCommonMixin {

    @Inject(
            method = "setScreen",
            at = @At("TAIL")
    )
    private void modid$logOpenedScreen(Screen screen, CallbackInfo ci) {
        ExampleModConstants.LOGGER.info("Opening screen: " + screen.getClass().getSimpleName());
    }
}
