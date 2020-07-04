package com.argame.www.objects;

/**
 * Class for create dynamic game object.
 */
public class DynamicGameObject extends GameObject {
    private Action action;
    private boolean isDead;

    /**
     * Create {@link DynamicGameObject}.
     *
     * @param x x - coordinate.
     * @param y y - coordinate.
     */
    public DynamicGameObject(float x, float y) {
        super(x, y);
    }

    private void move(){
        //TODO implement this for moving Dynamic Object
    }
}
