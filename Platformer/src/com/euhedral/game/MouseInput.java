package com.euhedral.game;

import com.euhedral.engine.EngineMouse;

import java.awt.event.MouseAdapter;

public class MouseInput extends MouseAdapter {
    private GameController gameController;
    private EngineMouse mouse;

    public MouseInput(EngineMouse engineMouse, GameController gameController) {
        this.gameController = gameController;
        mouse = engineMouse;
    }

    public void updatePressed() {

    }

    public void updateReleased() {

    }

    public void updateMoved() {

    }

    public int getMx() {
        return mouse.getMx();
    }

    public int getMy() {
        return mouse.getMy();
    }

    public int getMxPressed() {
        return mouse.getMxPressed();
    }

    public int getMyPressed() {
        return mouse.getMyPressed();
    }

    public int getMxReleased() {
        return mouse.getMxReleased();
    }

    public int getMyReleased() {
        return mouse.getMyReleased();
    }

    public void checkButtonPressed() {
        gameController.checkButtonAction(getMxPressed(), getMyPressed());
    }

    public void checkButtonReleased() {
        gameController.checkButtonAction(getMxReleased(), getMyReleased());
    }
}
