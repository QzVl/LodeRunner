package com.argame.www.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.argame.www.objects.BlockType;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test LevelMap class.
 */
public class LevelMapTest {
    private Set<LevelMap> levelMaps;
    private BlockType[] blockTypes;

    /**
     * Initializing levels and values of {@link BlockType}.
     */
    @Before
    public void init() {
        levelMaps = Set.of(new LevelOne());
        blockTypes = BlockType.values();
    }

    /**
     * Check that map contain all blockTypes values.
     */
    @Test
    public void checkCharacterBlockTypeMap() {
        //The map is always the same regardless of the level, so can take any level
        final LevelMap levelMap = levelMaps.stream().findFirst().orElse(new LevelOne());
        final Map<String, List<?>> gameObjects = levelMap.getGameObjects();
        Assert.assertEquals(blockTypes.length, gameObjects.size());
        for (BlockType blocktype : blockTypes) {
            Assert.assertEquals(true, gameObjects.containsKey(blocktype.name()));
        }
    }

    /**
     * Check properties for each level for not null.
     */
    @Test
    public void checkNotNullLevels() {
        for (LevelMap levelMap : levelMaps) {
            checkNotNullForLevel(levelMap);
        }
    }

    private void checkNotNullForLevel(LevelMap levelMap) {
        Assert.assertNotNull(levelMap);
        Assert.assertNotNull(levelMap.getMas());
        final Map<String, List<?>> gameObjects = levelMap.getGameObjects();
        for (BlockType blocktype : blockTypes) {
            Assert.assertNotNull(gameObjects.get(blocktype.name()));
        }
    }

    /**
     * Checks the parsing result for matching the number objects of each type to the number of each
     * character from the map.
     */
    @Test
    public void checkParseNumberOfObjects() {
        for (LevelMap levelMap : levelMaps) {
            checkParseNumberObjectsForLevel(levelMap);
        }
    }

    private void checkParseNumberObjectsForLevel(LevelMap levelMap) {
        final StringBuilder s = new StringBuilder();
        for (String[] c : levelMap.getMas()) {
            for (String cc : c) {
                s.append(cc);
            }
        }
        final Map<String, Long> collect = Arrays.stream(s.toString().split("")).collect(
                Collectors.groupingBy(c -> c, Collectors.counting()));
        final Map<String, List<?>> gameObjects = levelMap.getGameObjects();
        for (List<?> gameObjectsSpecificType : gameObjects.values()) {
            Assert.assertEquals(true, gameObjectsSpecificType.isEmpty());
        }
        levelMap.parse();
        for (Map.Entry<String, Long> map : collect.entrySet()) {
            Assert.assertEquals(false, gameObjects.get(map.getKey()).isEmpty());
            Assert.assertEquals(map.getValue(), Long.valueOf(gameObjects.get(map.getKey()).size()));
        }
    }
}
