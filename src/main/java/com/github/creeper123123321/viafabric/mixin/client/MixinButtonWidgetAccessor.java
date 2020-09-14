package com.github.creeper123123321.viafabric.mixin.client;

import net.minecraft.client.gui.widget.ButtonWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ButtonWidget.class)
public interface MixinButtonWidgetAccessor {
    @Accessor
    void setMessage(String s);
}
