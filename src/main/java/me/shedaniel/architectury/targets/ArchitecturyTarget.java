package me.shedaniel.architectury.targets;

public class ArchitecturyTarget {
    private ArchitecturyTarget() {}
    
    /**
     * Returns the current target identifier, for example, fabric and forge.
     */
    public static String getCurrentTarget() {
        throw new AssertionError();
    }
}
