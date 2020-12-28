package com.candycrush.main.handler;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class SpriteHandler {
    public static ArrayList<BufferedImage> divideSprite(BufferedImage image, int n_col, int n_row) {
        ArrayList<BufferedImage> textures = new ArrayList<>();

        for (int i = 0; i < n_row; i++) {
            for (int j = 0; j < n_col; j++) {
                textures.add(image.getSubimage(j * image.getWidth() / n_col, i * image.getHeight() / n_row, image.getWidth() / n_col, image.getHeight() / n_row));
            }
        }

        return textures;
    }
}