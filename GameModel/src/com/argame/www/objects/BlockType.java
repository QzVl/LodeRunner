package com.argame.www.objects;

/**
 * All types of blocks existing in the game.
 */
public enum BlockType {
    /**
     * Player - LodeRunner player.
     */
    p,
    /**
     * Bot - bot.
     */
    b,
    /**
     * Undestoyrable - cannot be destroyed.
     */
    u,
    /**
     * Destroyable - can be destroyed.
     */
    d,
    /**
     * Empty - empty space.
     */
    e,
    /**
     * Gold for passing the level.
     */
    g,
    /**
     * Finish for move to the next level.
     */
    f,
    /**
     * Stair for move vertically.
     */
    s

}
