package com.jmkopecky.aeternumcraft.abilities.spellComponents;

import com.jmkopecky.aeternumcraft.abilities.DefaultSpellComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

import javax.annotation.Nullable;

public class DetonateSpellComponent extends DefaultSpellComponent {

    String componentName = "detonate";
    int amplification;


    public DetonateSpellComponent(int amplification) {
        this.amplification = amplification;
    }



    @Override
    public void triggerSpell(Player caster, @Nullable LivingEntity targetEntity, @Nullable BlockPos blockPos) {
        float explosionRadius = 4+amplification;
        if (targetEntity != null) {
            targetEntity.getLevel().explode(null, targetEntity.getX(), targetEntity.getY(), targetEntity.getZ(), explosionRadius, Explosion.BlockInteraction.BREAK);
        } else if (blockPos != null) {
            caster.getLevel().explode(null, blockPos.getX(), blockPos.getY(), blockPos.getZ(), explosionRadius, Explosion.BlockInteraction.BREAK);
        }
    }
}
