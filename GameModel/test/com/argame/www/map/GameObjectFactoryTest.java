package com.argame.www.map;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.argame.www.objects.BlockType;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for {@link GameObjectFactory}.
 */
public class GameObjectFactoryTest {

    /**
     * Tests the creation of objects of each {@link BlockType} by the factory {@link
     * GameObjectFactory}.
     */
    @Test
    public void checkCreatingAllBlockTypes() {
        final GameObjectFactory gameObjectFactory = new GameObjectFactory();
        final LevelMap levelMap = new LevelOne();
        final Map<String, List<?>> gameObjects = levelMap.getGameObjects();
        for (BlockType blockType : BlockType.values()) {
            final List<?> definedTypeGameObjects = gameObjects.get(blockType.name());
            Assert.assertNotNull(definedTypeGameObjects);
            gameObjectFactory.getGameObject(definedTypeGameObjects, blockType, 0, 0);
            Assert.assertNotEquals(0, definedTypeGameObjects.size());
        }
    }
}