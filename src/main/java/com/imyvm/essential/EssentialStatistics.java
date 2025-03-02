package com.imyvm.essential;

import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EssentialStatistics {
    // The total amount of time played (tracked in seconds)
    public static final Identifier PLAY_TIME_TRACK;

    // Force JVM to initialize the static fields
    public static void initialize() {}

    private static Identifier register(String id, StatFormatter formatter) {
        Identifier identifier = new Identifier(EssentialMod.MOD_ID, id);
        Registry.register(Registry.CUSTOM_STAT, id, identifier);
        Stats.CUSTOM.getOrCreateStat(identifier, formatter);
        return identifier;
    }

    static {
        PLAY_TIME_TRACK = register("play_time_track", StatFormatter.DEFAULT);
    }
}
