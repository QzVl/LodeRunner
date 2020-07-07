package com.argame.www.model;

import java.lang.reflect.Field;
import java.util.List;

import com.argame.www.objects.DestroyableBlock;
import com.argame.www.objects.EmptyBlock;
import com.argame.www.objects.FinishBlock;
import com.argame.www.objects.GoldBlock;
import com.argame.www.objects.Player;
import com.argame.www.objects.StairsBlock;
import com.argame.www.objects.UndestroyableBlock;

import org.junit.Assert;
import org.junit.Test;

public class ModelTest {
    private final List<DestroyableBlock> destroyableBlocks;
    private final List<EmptyBlock> emptyBlocks;
    private final List<FinishBlock> finishBlocks;
    private final List<GoldBlock> goldBlocks;
    private final List<StairsBlock> stairsBlocks;
    private final List<UndestroyableBlock> undestroyableBlocks;
    private final List<Player> players;

    @Test
    public void check() {
        final Model model = new Model();
        final Class modelClass = model.getClass();
        final Field[] fields = modelClass.getDeclaredFields();
        Assert.assertNotNull(fields);
        Assert.assertNotNull(model.getDestroyableBlocks());
        Assert.assertNotNull(model.getEmptyBlocks());
        Assert.assertNotNull(model.getFinishBlocks());
        Assert.assertNotNull(model.getGoldBlocks());
        Assert.assertNotNull(model.getPlayers());
        Assert.assertNotNull(model.getStairsBlocks());
        Assert.assertNotNull(model.getUndestroyableBlocks());
    }
}
