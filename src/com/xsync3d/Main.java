package com.xsync3d;

import com.xsync3d.engine.Window;
import com.xsync3d.engine.console.Console;

public class Main implements Runnable {
    public Thread game;
    public static Window window;
    public static final int WIDTH = 1280, HEIGHT = 760;
    static Console console = new Console();

    public void start() {
        game = new Thread(this, "game");
        game.start();
    }

    public static void init() {
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
        console.run();
        new Main().start();
    }
}