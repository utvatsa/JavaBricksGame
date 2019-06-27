/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Susobhan Roy
 */
public class Brick {
    private static final int WITH = 40;
    private static final int HEIGHT = 10;
    int x = 200;
    int y=0;
    int bx=5;
    int by=50;
     int c=0;
    private Game game;

	public Brick(Game game) {
		this.game = game;
	}
    public void paint(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
	for(int i=0;i<=100;i++){
            g.fillRect(bx, by, 40, 10);
            if (i == 0) {   
                bx = 5;
                by = 50;
                g.setColor(Color.red);
            }
            if (i == 10){
                bx = 5;
                by = 62;
                g.setColor(Color.red);
            }
            if (i == 20){
                bx = 5;
                by = 74;
                g.setColor(Color.green);
            }
            if (i == 30){
                bx = 5;
                by = 88;
                g.setColor(Color.green);
            }
            if (i == 40){
                bx = 5;
                by = 102;
                g.setColor(Color.orange);
            }
            if (i == 50){
                bx = 5;
                by = 116;
                g.setColor(Color.orange);
            }
            if (i == 60){
                bx = 5;
                by = 130;
                g.setColor(Color.cyan);
            }
            if (i == 70){
                bx = 5;
                by = 144;
                g.setColor(Color.cyan);
            }
            if (i == 80){
                bx = 5;
                by = 158;
                g.setColor(Color.yellow);
            }
            if (i == 90 || i==100){
                bx = 5;
                by = 172;
                g.setColor(Color.yellow);
            }
            bx += 41;
	}
    }
    public Rectangle getBounds() {
            for(int i=0;i<=100;i++){
            if (i == 0) {   
                x = 5;
                y = 50;
            }
            if (i == 10){
                x = 5;
                y = 62;
            }
            if (i == 20){
                x = 5;
                y = 74;
            }
            if (i == 30){
                x = 5;
                y = 88;
            }
            if (i == 40){
                x = 5;
                y = 102;
            }
            if (i == 50){
                x = 5;
                y = 116;
            }
            if (i == 60){
                x = 5;
                y = 130;
            }
            if (i == 70){
                x = 5;
                y = 144;
            }
            if (i == 80){
                x = 5;
                y = 158;
            }
            if (i == 90 || i==100){
                x = 5;
                y = 172;
            }
            bx += 41;
	}
		return new Rectangle(x, y, WITH, HEIGHT);
	}
}