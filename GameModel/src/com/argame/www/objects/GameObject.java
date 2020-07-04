package com.argame.www.objects;

/**
 * Class for create all game objects.
 */
public class GameObject {
    private float x;
    private float y;
    private float width;
    private float height;
    private BlockType blockType;

    /**
     * Create {@link GameObject}.
     *
     * @param x x - coordinate.
     * @param y y - coordinate.
     */
    public GameObject(float x, float y) {
        this.x = x;
        this.y = y;
        this.width = 0;
        this.height = 0;
    }

    /**
     * Create {@link GameObject}.
     * @param x x- coordinate.
     * @param y y - coordinate.
     * @param blockType BlockType.
     */
    public GameObject(float x, float y, BlockType blockType) {
        this.x = x;
        this.y = y;
        this.blockType = blockType;
    }

    protected float getX() {
        return x;
    }

    protected float getY() {
        return y;
    }

    protected float getWidth() {
        return width;
    }

    protected float getHeight() {
        return height;
    }

    /**
     * {@link GameObject} collides with another {@link GameObject}.
     *
     * @param gameObject game object with which collision is checked.
     */
    public void collides(GameObject gameObject) {
        //TODO implement this for collides objects
    }
}
