package com.xsync3d.editor;

import com.xsync3d.engine.Window;

import java.awt.*;

public class Mapper extends Window {
    private final int height;
    private final int width;

    public Mapper(int width, int height, String title) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        this.width = gd.getDisplayMode().getWidth();
        this.height = gd.getDisplayMode().getHeight();
    }
}
