package com.imyvm.essential;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class EssentialGameRules {
    // Creeper rules
    public static GameRules.Key<GameRules.BooleanRule> DO_CREEPER_GRIEFING;

    // Force JVM to initialize the static fields
    public static void initialize() {}

    static {
        EssentialGameRules.DO_CREEPER_GRIEFING = GameRuleRegistry.register("doCreeperGriefing", GameRules.Category.MOBS, GameRuleFactory.createBooleanRule(true));
    }
}
