package com.argame.www.model;

import java.awt.geom.Rectangle2D;
import java.util.List;

import com.argame.www.map.LevelMap;
import com.argame.www.map.LevelOne;
import com.argame.www.objects.DestroyableBlock;
import com.argame.www.objects.EmptyBlock;
import com.argame.www.objects.FinishBlock;
import com.argame.www.objects.GameObject;
import com.argame.www.objects.GoldBlock;
import com.argame.www.objects.Player;
import com.argame.www.objects.StairsBlock;
import com.argame.www.objects.UndestroyableBlock;

/**
 * Сlass for create logic and a cycle of games.
 */
public class Model {
    private static final long TIME_PER_STEP = 0L;
    private static final float SCALE_FACTOR = 1F;
    private List<LevelMap> map;
    private float modelWidth;
    private float modelHeight;
    private final List<DestroyableBlock> destroyableBlocks;
    private final List<EmptyBlock> emptyBlocks;
    private final List<FinishBlock> finishBlocks;
    private final List<GoldBlock> goldBlocks;
    private final List<StairsBlock> stairsBlocks;
    private final List<UndestroyableBlock> undestroyableBlocks;
    private final List<Player> players;

    /**
     * Creates {@link Model} instance.
     */
    public Model() {
        final LevelMap levelMap = new LevelOne();
        players = levelMap.getPlayers();
        destroyableBlocks = levelMap.getDestroyableBlocks();
        emptyBlocks = levelMap.getEmptyBlocks();
        finishBlocks = levelMap.getFinishBlocks();
        goldBlocks = levelMap.getGoldBlocks();
        stairsBlocks = levelMap.getStairsBlocks();
        undestroyableBlocks = levelMap.getUndestroyableBlocks();
        scaleAdjustment();
    }

    private void scaleAdjustment() {
        for (Player player : players) {
            scaleAdjusmentForGameObject(player);
        }
        for (UndestroyableBlock undestroyableBlock : undestroyableBlocks) {
            scaleAdjusmentForGameObject(undestroyableBlock);
        }
        for (StairsBlock stairsBlock : stairsBlocks) {
            scaleAdjusmentForGameObject(stairsBlock);
        }
        for (StairsBlock stairsBlock : stairsBlocks) {
            scaleAdjusmentForGameObject(stairsBlock);
        }
        for (GoldBlock goldBlock : goldBlocks) {
            scaleAdjusmentForGameObject(goldBlock);
        }
        for (FinishBlock finishBlock : finishBlocks) {
            scaleAdjusmentForGameObject(finishBlock);
        }
        for (EmptyBlock emptyBlock : emptyBlocks) {
            scaleAdjusmentForGameObject(emptyBlock);
        }
        for (DestroyableBlock destroyableBlock : destroyableBlocks) {
            scaleAdjusmentForGameObject(destroyableBlock);
        }
    }

    /**
     *
     * @param gameObject
     */
    private void scaleAdjusmentForGameObject(GameObject gameObject) {
        final Rectangle2D.Float rectangle = gameObject.getRectangle();
        rectangle.setRect(rectangle.getX() * SCALE_FACTOR, rectangle.getY() * SCALE_FACTOR,
                rectangle.getWidth() * SCALE_FACTOR, rectangle.getHeight() * SCALE_FACTOR);
    }

    /*private void Run(){
        // now() would be whatever function you use to get the current time (in
        // microseconds or milliseconds).
        long lastStep = System.currentTimeMillis();
        // This would be your main loop.
        while (true) {
            long curTime = System.currentTimeMillis();

            // Calculate the time spent since last step.
            long timeSinceLast = curTime - lastStep;

            // Skip logic if no game step is to occur.
            if (timeSinceLast < TIME_PER_STEP) continue;

            // We can't assume that the loop always hits the exact moment when the step
            // should occur. Most likely, it has spent slightly more time, and here we
            // correct that so that the game doesn't shift out of sync.
            // NOTE: You may want to make sure that + is the correct operator here.
            //       I tend to get it wrong when writing from the top of my head :)
            lastStep = curTime + timeSinceLast % TIME_PER_STEP;

            // Move your game forward one step.

        }
    }*/

    protected static long getTimePerStep() {
        return TIME_PER_STEP;
    }

    protected static float getScaleFactor() {
        return SCALE_FACTOR;
    }

    protected List<LevelMap> getMap() {
        return map;
    }

    protected float getModelWidth() {
        return modelWidth;
    }

    protected float getModelHeight() {
        return modelHeight;
    }

    protected List<DestroyableBlock> getDestroyableBlocks() {
        return destroyableBlocks;
    }

    protected List<EmptyBlock> getEmptyBlocks() {
        return emptyBlocks;
    }

    protected List<FinishBlock> getFinishBlocks() {
        return finishBlocks;
    }

    protected List<GoldBlock> getGoldBlocks() {
        return goldBlocks;
    }

    protected List<StairsBlock> getStairsBlocks() {
        return stairsBlocks;
    }

    protected List<UndestroyableBlock> getUndestroyableBlocks() {
        return undestroyableBlocks;
    }

    protected List<Player> getPlayers() {
        return players;
    }
}
