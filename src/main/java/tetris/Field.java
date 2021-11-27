package tetris;

import tetris.figures.Figure;
import tetris.gui.Block;

public class Field {

    private final int width, height;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void detectCollision(Figure figure) throws CollisionException {
        for (Block block : figure.getBlocks()) {
            if (block.x < 0 || block.x >= width || block.y < 0 || block.y >= height)
                throw new CollisionException("Detected collision with field border!");
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}