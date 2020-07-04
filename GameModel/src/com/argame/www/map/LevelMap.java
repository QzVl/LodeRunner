package com.argame.www.map;

import java.util.Collection;
import java.util.Map;

import com.argame.www.objects.BlockType;
import com.argame.www.objects.GameObject;

/**
 * A class that represents a map or multiple maps of the game.
 */
public abstract class LevelMap {
    /**
     * Sasdasd.
     */
    public static final Map<Character, BlockType> characterBlockTypeMap =
            initCharacterToBlockType();
    private char[][] mas;

    private static Map<Character, BlockType> initCharacterToBlockType() {
        return Map.of('p', BlockType.PLAYER,
                'e', BlockType.ENEMY,
                'u', BlockType.UNDESTROYABLE,
                'd', BlockType.DESTROYABLE,
                '0', BlockType.EMPTY,
                'g', BlockType.GOLD,
                's', BlockType.STAIRS,
                'f', BlockType.FINISH);
    }

    /**
     * Create and return List of GameObjects according to.
     * p - player;
     * e -enemy;
     * u - undestroyable;
     * d - destroyable;
     * 0 - empty;
     * g - gold;
     * s - stairs;
     * f - finish;
     * @return list of game objects.
     */
    public abstract Map<String, Collection<GameObject>> parse();

    protected char[][] getMas() {
        return mas;
    }

    protected void setMas(char[][] mas) {
        this.mas = mas;
    }
}
