package com.argame.www.map;

import java.util.ArrayList;
import java.util.List;

import com.argame.www.objects.BlockType;
import com.argame.www.objects.GameObject;
import com.argame.www.objects.StaticGameObject;

/**
 * Level_1.
 */

public class LevelOne extends LevelMap {

    /**
     * Level1 mas initialize.
     */
    public LevelOne() {
        setMas(new char[][] {
            {'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u'},
            {'u', 's', '0', 'g', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'u'},
            {'u', 's', 'd', 'd', 'd', 'd', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'f', 'u'},
            {'u', 's', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 's', 'u'},
            {'u', 's', '0', '0', '0', '0', '0', '0', '0', '0', 's', 'd', 'u', 'd', 'u', '0', '0', '0', 's', 'u'},
            {'u', 'u', 'u', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 's', '0', '0', '0', '0', '0', '0', '0', 's', 'u'},
            {'u', 'u', 'd', 'd', 'g', 'd', 'd', 'd', 'd', 'd', 's', '0', '0', '0', '0', 'g', '0', '0', 's', 'u'},
            {'u', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 's', 'g', '0', '0', '0', '0', '0', '0', 's', 'u'},
            {'u', 'd', 'g', 'd', '0', '0', '0', '0', '0', '0', 's', '0', '0', '0', '0', '0', '0', '0', 's', 'u'},
            {'u', '0', '0', '0', '0', 's', 'd', 'd', 'd', 'd', 's', '0', '0', 'u', 'u', 'u', '0', '0', 's', 'u'},
            {'u', '0', '0', '0', '0', 's', '0', '0', '0', '0', 's', '0', 'g', '0', '0', '0', '0', '0', 's', 'u'},
            {'u', 's', 'd', 'u', 'd', 'u', '0', '0', '0', '0', 's', '0', '0', '0', '0', '0', '0', '0', 's', 'u'},
            {'u', 's', '0', '0', '0', '0', '0', '0', '0', '0', 's', '0', '0', '0', '0', '0', '0', '0', 's', 'u'},
            {'u', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'u'},
            {'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u'}}
        );
    }


    @Override
    public List<GameObject> parse() {
        final List<GameObject> result = new ArrayList<>();
        final char[][] mas = getMas();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                switch (mas[i][j]) {
                    case 'u':
                        result.add(new StaticGameObject(i, j, BlockType.UNDESTROYABLE));
                        break;
                    case 'd':
                        result.add(new StaticGameObject(i, j, BlockType.DESTROYABLE));
                        break;
                    case '0':
                        result.add(new StaticGameObject(i, j, BlockType.EMPTY));
                        break;
                    case 's':
                        result.add(new StaticGameObject(i, j, BlockType.STAIRS));
                        break;
                    case 'g':
                        result.add(new StaticGameObject(i, j, BlockType.GOLD));
                        break;
                    case 'f':
                        result.add(new StaticGameObject(i, j, BlockType.FINISH));
                        break;
                }
            }
        }
        return result;
    }
}