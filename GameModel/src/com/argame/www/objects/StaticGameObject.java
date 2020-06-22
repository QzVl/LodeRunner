package com.argame.www.objects;

/**
 * Class for create static game object. (Blocks {@link BlockType})
 */
public class StaticGameObject extends GameObject {
    private BlockType blockType;

    /**
     * Create Static gameObject.
     * @param x x coordinate.
     * @param y y coordinate.
     * @param blockType blockType type of StaticGameObject.
     */
    public StaticGameObject(float x, float y, BlockType blockType) {
        super(x, y);
        this.blockType = blockType;
    }
}
