package com.colorful_hoarfrost.colorful_craft.component.type;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

import java.util.List;

public class ModConsumableComponents {
    public static final ConsumableComponent DIAMOND_APPLE = ConsumableComponents.food()
            .consumeSeconds(3.6F)
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            List.of(
                                    new StatusEffectInstance(StatusEffects.SATURATION, 6400, 0),
                                    new StatusEffectInstance(StatusEffects.RESISTANCE, 6400, 4)
                            )
                    )
            )
            .build();
}