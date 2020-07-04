package com.argame.www.objects;

/**
 * All types of blocks existing in the game.
 */
public enum BlockType {
    /**
     * Player - LodeRunner player.
     */
    PLAYER,
    /**
     * Enemy - enemy.
     */
    ENEMY,
    /**
     * Undestoyrable - cannot be destroyed.
     */
    UNDESTROYABLE,
    /**
     * Destroyable - can be destroyed.
     */
    DESTROYABLE,
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
    STAIRS
}
