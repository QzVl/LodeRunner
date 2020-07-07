package com.argame.www.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.argame.www.objects.BlockType;
import com.argame.www.objects.BotBlock;
import com.argame.www.objects.DestroyableBlock;
import com.argame.www.objects.EmptyBlock;
import com.argame.www.objects.FinishBlock;
import com.argame.www.objects.GoldBlock;
import com.argame.www.objects.Player;
import com.argame.www.objects.StairsBlock;
import com.argame.www.objects.UndestroyableBlock;

/**
 * A class that represents a map or multiple maps of the game.
 */
public abstract class LevelMap {
    /**
     * Sasdasd.
     */
    private String[][] mas;
    private final List<Player> players = new ArrayList<>();
    private final List<BotBlock> botBlocks = new ArrayList<>();
    private final List<UndestroyableBlock> undestroyableBlocks = new ArrayList<>();
    private final List<DestroyableBlock> destroyableBlocks = new ArrayList<>();
    private final List<EmptyBlock> emptyBlocks = new ArrayList<>();
    private final List<GoldBlock> goldBlocks = new ArrayList<>();
    private final List<StairsBlock> stairsBlocks = new ArrayList<>();
    private final List<FinishBlock> finishBlocks = new ArrayList<>();
    private final Map<String, List<?>> gameObjects = initCharacterToGameObjects();

    private Map<String, List<?>> initCharacterToGameObjects() {
        return Map.of(
                BlockType.p.name(), players,
                BlockType.b.name(), botBlocks,
                BlockType.u.name(), undestroyableBlocks,
                BlockType.d.name(), destroyableBlocks,
                BlockType.e.name(), emptyBlocks,
                BlockType.g.name(), goldBlocks,
                BlockType.s.name(), stairsBlocks,
                BlockType.f.name(), finishBlocks);
    }

    /**
     * Fill game objects collections for each {@link BlockType}.
     */
    protected void parse() {
        final String[][] mas = getMas();
        final Map<String, List<?>> characterToGameObjects = initCharacterToGameObjects();
        final GameObjectFactory gameObjectFactory = new GameObjectFactory();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                //fill result map sets
                gameObjectFactory.getGameObject(characterToGameObjects.get(mas[i][j]),
                        BlockType.valueOf(mas[i][j]), i, j);
            }
        }
    }

    protected String[][] getMas() {
        return mas;
    }

    protected void setMas(String[][] mas) {
        this.mas = mas;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<BotBlock> getBotBlocks() {
        return botBlocks;
    }

    public List<UndestroyableBlock> getUndestroyableBlocks() {
        return undestroyableBlocks;
    }

    public List<DestroyableBlock> getDestroyableBlocks() {
        return destroyableBlocks;
    }

    public List<EmptyBlock> getEmptyBlocks() {
        return emptyBlocks;
    }

    public List<GoldBlock> getGoldBlocks() {
        return goldBlocks;
    }

    public List<StairsBlock> getStairsBlocks() {
        return stairsBlocks;
    }

    public List<FinishBlock> getFinishBlocks() {
        return finishBlocks;
    }

    protected Map<String, List<?>> getGameObjects() {
        return gameObjects;
    }
}
