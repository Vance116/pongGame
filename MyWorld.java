import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Ball Ball = new Ball();
        addObject(Ball, getWidth()/2, getHeight()/2);
        
        
        Pong1 Pong1 = new Pong1();
        addObject(Pong1, getWidth()/26, getHeight()/2);
        
        Pong2 Pong2 = new Pong2();
        addObject(Pong2, 577, getHeight()/2);
        
        showText("PONG GAME" , 75, 25);
        showText("By Alex Vance", 75, 45);
        
        counter counter = new counter();
        addObject(counter, getWidth()/2, 25);
        
    }
}
