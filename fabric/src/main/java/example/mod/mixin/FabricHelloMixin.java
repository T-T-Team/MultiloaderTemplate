package example.mod.mixin;

import example.mod.ExampleModConstants;
import example.mod.Platform;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class FabricHelloMixin {

    @Inject(
            method = "setScreen",
            at = @At("TAIL")
    )
    private void modid$helloFabric(Screen screen, CallbackInfo ci) {
        ExampleModConstants.LOGGER.info("Hello from {}, opening screen with {} widgets", Platform.get().getModLoaderName(), screen != null ? screen.renderables.size() : 0);
    }
}
