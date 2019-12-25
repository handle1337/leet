package com.xsync3d.editor;

import com.xsync3d.engine.Window;

import java.awt.*;

public class EditorWindow {
    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    public static Window window;

    public static void init() {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        final int WIDTH = gd.getDisplayMode().getWidth();
        final int HEIGHT = gd.getDisplayMode().getHeight();
        window = new Window(WIDTH, HEIGHT, "Game");
        window.create();
    }

    private static void render() {
        window.swapBuffers();
    }

    public static void run() {
        init();
        while (!window.shouldClose()) {
            window.update();
            render();
        }
    }
}