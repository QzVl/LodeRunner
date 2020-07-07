package com.argame.www.objects;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;

/**
 * Class for create all game objects.
 */
public class GameObject {
    private Rectangle2D.Float rectangle;

    /**
     * Create {@link GameObject}.
            *
            * @param x x - coordinate.
     * @param y y - coordinate.
     */
    public GameObject(float x, float y) {
        rectangle = new Rectangle2D.Float(x, y, 1f, 1f);
    }

    public Rectangle2D.Float getRectangle() {
        return rectangle;
    }

    /**
     * {@link GameObject} collides with another {@link GameObject}.
     *
     * @param gameObject game object with which collision is checked.
     * @return true if the objects collided otherwise false.
     */
    public boolean collides(GameObject gameObject) {
        final Float otherRectangle = gameObject.getRectangle();
        if (this.rectangle.x < otherRectangle.x + otherRectangle.width &&
                this.rectangle.x + this.rectangle.width > otherRectangle.x &&
                this.rectangle.y < otherRectangle.y + otherRectangle.height &&
                this.rectangle.y + this.rectangle.height > otherRectangle.y) {
            return true;
        }
        return false;
    }
}
