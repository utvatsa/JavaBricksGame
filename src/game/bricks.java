/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
/**
 *
 * @author Susobhan Roy
 */
public class bricks {
    Rectangle[] brick=new Rectangle[100];
    int i;
    int x=0;
    int y=70;
    for(int i=1; i<=100 ;i++)
    {
        brick[i]=new Rectangle(x,y,30,10);
        x+=40;
        if(i==10)
        {
            x=0;
            y=y+10;
        }
    }
}
