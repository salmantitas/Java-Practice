package com.euhedral.game;

import java.awt.*;

public class BulletPlayerAir extends BulletPlayer{

    BulletPlayerAir(int x, int y, double dir) {
        super(x, y, ID.Air, dir);
        color = Color.YELLOW;
    }
}
