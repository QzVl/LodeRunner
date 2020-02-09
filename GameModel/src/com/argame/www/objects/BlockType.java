package com.argame.www.objects;

/**
 * All types of blocks existing in the game.
 */
public enum BlockType {
    /**
     * Invulnerable - cannot be destroyed.
     */
    INVULNERABLE,
    /**
     * Simple - can be destroyed.
     */
    SIMPLE,
    /**
     * Empty - empty space.
     */
    EMPTY,
    /**
     * Gold for passing the level.
     */
    GOLD,
    /**
     * Finish for move to the next level.
     */
    FINISH,
    /**
     * Stair for move vertically.
     */
    STAIR
}
