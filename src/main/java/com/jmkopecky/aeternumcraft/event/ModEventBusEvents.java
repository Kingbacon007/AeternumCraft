package com.jmkopecky.aeternumcraft.event;


import com.jmkopecky.aeternumcraft.AeternumCraft;
import com.jmkopecky.aeternumcraft.particle.ModParticles;
import com.jmkopecky.aeternumcraft.particle.custom.*;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AeternumCraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register(ModParticles.SPELL_TRAIL_PARTICLE.get(),
                SpellTrailParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.SPELL_PROJECTILE_PARTICLE.get(),
                SpellProjectileParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.SPELL_BURST_TRAIL_PARTICLE.get(),
                SpellBurstTrailParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.SPELL_BURST_PROJECTILE_PARTICLE.get(),
                SpellBurstProjectileParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.SPELL_SCATTER_TRAIL_PARTICLE.get(),
                SpellScatterTrailParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.SPELL_SCATTER_PROJECTILE_PARTICLE.get(),
                SpellScatterProjectileParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.SPELL_SCATTER_BURST_TRAIL_PARTICLE.get(),
                SpellScatterBurstTrailParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.SPELL_SCATTER_BURST_PROJECTILE_PARTICLE.get(),
                SpellScatterBurstProjectileParticle.Provider::new);
    }

}
