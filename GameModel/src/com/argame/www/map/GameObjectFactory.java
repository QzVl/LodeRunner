package com.argame.www.map;

import java.util.List;

import com.argame.www.objects.BlockType;
import com.argame.www.objects.BotBlock;
import com.argame.www.objects.DestroyableBlock;
import com.argame.www.objects.EmptyBlock;
import com.argame.www.objects.FinishBlock;
import com.argame.www.objects.GameObject;
import com.argame.www.objects.GoldBlock;
import com.argame.www.objects.Player;
import com.argame.www.objects.StairsBlock;
import com.argame.www.objects.UndestroyableBlock;

/**
 * Factory class for creating {@link GameObject} of various types.
 */
public class GameObjectFactory {

    /**
     * Creates a types object corresponding to the block type.
     *
     * @param gameObjects game objects collection of the exact type.
     * @param blockType block type.
     * @param x x coordinate.
     * @param y y coordinate.
     * @param <T> Exact type {@link GameObject}.
     */
    public <T> void getGameObject(List<T> gameObjects, BlockType blockType, float x, float y) {
        final GameObject gameObject;
        switch (blockType) {
            case p:
                gameObject = new Player(x, y);
                break;
            case b:
                gameObject = new BotBlock(x, y);
                break;
            case u:
                gameObject = new UndestroyableBlock(x, y);
                break;
            case d:
                gameObject = new DestroyableBlock(x, y);
                break;
            case e:
                gameObject = new EmptyBlock(x, y);
                break;
            case g:
                gameObject = new GoldBlock(x, y);
                break;
            case f:
                gameObject = new FinishBlock(x, y);
                break;
            case s:
                gameObject = new StairsBlock(x, y);
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("Wrong game object type: '%s'", blockType));
        }
        gameObjects.add((T)gameObject);
    }
}
