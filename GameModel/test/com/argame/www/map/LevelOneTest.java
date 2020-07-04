package com.argame.www.map;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import com.argame.www.objects.GameObject;

import org.junit.Assert;
import org.junit.Test;

/**
 * LevelOne tests.
 */
public class LevelOneTest {
    /**
     * Check that result of parse() method not null.
     */
    @Test
    public void checkParseNotNull() {
        final LevelOne levelOne = new LevelOne();
        final Map<String, Collection<GameObject>> resultMap = levelOne.parse();
        Assert.assertNotNull(resultMap);
        Assert.assertEquals(false, resultMap.isEmpty());
        for (String s : resultMap.keySet()) {
            Assert.assertNotNull(s);
            Assert.assertEquals(false, s.isEmpty());
        }
        for (Collection<GameObject> collection : resultMap.values()) {
            Assert.assertNotNull(resultMap);
            for (GameObject gameObject : collection) {
                Assert.assertNotNull(gameObject);
            }
        }
    }

    /**
     * Check that parse() create correct number of objects for each type in mas.
     */
    @Test
    public void checkParseNumberOfObjects() {
        final LevelOne levelOne = new LevelOne();
        final char[][] chars = levelOne.getMas();
        final Map<String, Collection<GameObject>> resultMap = levelOne.parse();
        String s = "";
        for (char[] c : chars) {
            s += String.valueOf(c);
        }
        final Map<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(
                        c -> LevelMap.characterBlockTypeMap.get(c.charAt(0)).name(),
                        Collectors.counting()));
        for (Map.Entry<String, Long> map : collect.entrySet()) {
            Assert.assertEquals((long)map.getValue(), resultMap.get(map.getKey()).size());
        }
        System.out.println();
    }

    /**
     * Check level1 char mas contains correct symbols.
     */
    @Test
    public void checkLevel1MasChars() {
        final StringBuilder chars = new StringBuilder();
        for (Character symbol : LevelMap.characterBlockTypeMap.keySet()) {
            chars.append(symbol);
        }
        final LevelOne levelOne = new LevelOne();
        final char[][] mas = levelOne.getMas();
        Assert.assertNotNull(mas);
        Assert.assertNotEquals(0, mas.length);
        for (char[] singleMas : mas) {
            Assert.assertNotEquals(0, singleMas.length);
            for (char symbol : singleMas) {
                Assert.assertTrue(chars.toString().contains(Character.toString(symbol)));
            }
        }
    }
}
