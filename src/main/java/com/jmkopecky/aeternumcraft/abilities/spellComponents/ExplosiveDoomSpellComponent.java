package com.jmkopecky.aeternumcraft.abilities.spellComponents;

import com.jmkopecky.aeternumcraft.abilities.DefaultSpellComponent;
import com.jmkopecky.aeternumcraft.effects.EffectsRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

import javax.annotation.Nullable;

public class ExplosiveDoomSpellComponent extends DefaultSpellComponent {

    String componentName = "explosivedoom";
    int amplification;


    public ExplosiveDoomSpellComponent(int amplification) {
        this.amplification = amplification;
    }


    @Override
    public void triggerSpell(Player caster, @Nullable LivingEntity targetEntity, @Nullable BlockPos blockPos) {
        int duration = 200+(amplification*40);
        if (targetEntity != null) {
            targetEntity.addEffect(new MobEffectInstance(EffectsRegister.ExplodePeriodically.get(), duration, amplification+1));
        }
    }
}
