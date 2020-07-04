package com.argame.www.map;

import com.argame.www.objects.BlockType;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test LevelMap class.
 */
public class LevelMapTest {
    /**
     * Check that map contain all blockTypes values.
     */
    @Test
    public void checkCharacterBlockTypeMap() {
        Assert.assertEquals(BlockType.values().length, LevelMap.characterBlockTypeMap.size());
        for (BlockType blocktype : BlockType.values()) {
            Assert.assertTrue(LevelMap.characterBlockTypeMap.values().contains(blocktype));
        }
    }
}
