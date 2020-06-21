package com.argame.www.model;

import java.util.List;

import com.argame.www.map.LevelMap;
import com.argame.www.objects.Enemy;
import com.argame.www.objects.Player;
import com.argame.www.objects.StaticGameObject;

/**
 * Сlass for create logic and a cycle of games.
 */
public class Model {
    private Player player;
    private List<Enemy> enemies;
    private LevelMap map;
    private List<StaticGameObject> blocks;
    private float modelWidth;
    private float modelHeight;
    private float scaleFactor;
}
