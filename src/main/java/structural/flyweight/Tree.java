package structural.flyweight;

import java.awt.*;

public class Tree {
    private int x; //4 bytes
    private int y; //4 bytes
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g){
        type.draw(g, x, y);
    }
}
