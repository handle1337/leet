package com.xsync3d;

import com.xsync3d.engine.Window;

public class Main implements Runnable {
    public Thread game;
    public Window window;
    public final int WIDTH = 1280, HEIGHT = 760;
    public long time;
    public int frames;

    public void start() {
        game = new Thread(this, "game");
        game.start();
        time = System.currentTimeMillis();
    }

    public void init() {
        window = new Window(WIDTH, HEIGHT, "Game");
        window.create();
    }

    public void run() {
        init();
        while (!window.shouldClose()) {
            update();
            render();
        }
    }

    private void update() {
        window.update();
    }

    private void render() {
        window.swapBuffers();
    }

    public static void main(String[] args) {
       //TODO fix console.run(); "java.lang.NullPointerException"
        new Main().start();
    }
}