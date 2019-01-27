import java.awt.*;

public class EnemyGroundBasic extends EnemyGround {

    public EnemyGroundBasic(int x, int y) {
        super(x,y);
        velX = Engine.floatAtWidth640(1)/2;
        velY = Engine.floatAtWidth640(2)/4;
        width = Engine.intAtWidth640(32);
        height = 2* width;
        color = Color.pink;
    }

    public void render(Graphics g) {

        for (Bullet bullet: bullets) {
            bullet.render(g);
        }

        g.setColor(color);
        g.fillRect(x,y,width,height);
    }

    public void setX(int x) {
        this.x = x;
    }

    // Private Methods

    public void move() {
        y += velY;
    }
}
