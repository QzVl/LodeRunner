package com.argame.www.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.argame.www.objects.BlockType;
import com.argame.www.objects.GameObject;

/**
 * Level_1.
 */

public class LevelOne extends LevelMap {

    /**
     * Level1 mas initialize.
     */
    public LevelOne() {
        setMas(new char[][]{
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
                {'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u'}});
    }

    @Override
    public Map<String, Collection<GameObject>> parse() {
        final Map<String, Collection<GameObject>> result = new HashMap<>();
        final char[][] mas = getMas();
        //initialize result map structure
        for (BlockType blockType : characterBlockTypeMap.values()) {
            result.put(blockType.name(), new HashSet<>());
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                //fill result map sets
                final BlockType blockType = characterBlockTypeMap.get(mas[i][j]);
                result.get(blockType.name()).add(new GameObject(i, j, blockType));
            }
        }
        return Collections.unmodifiableMap(result);
    }
}
