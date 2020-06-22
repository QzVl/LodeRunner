package com.argame.www.map;

import java.util.List;

import com.argame.www.objects.GameObject;

/**
 * A class that represents a map or multiple maps of the game.
 */
public abstract class LevelMap {
    private char[][] mas;


    /**
     * Create and return List of GameObjects according to:
     * u - undestroyable;
     * d - destroyable;
     * 0 - empty;
     * g - gold
     * s - stairs
     * f - finish
     * * @return
     */

    public abstract List<GameObject> parse();

    protected char[][] getMas() {
        return mas;
    }

    protected void setMas(char[][] mas) {
        this.mas = mas;
    }
}
