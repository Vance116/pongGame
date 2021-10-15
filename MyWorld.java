import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score1 = 0;
    public static int score2 = 0;
    /**
     * Spawns everything
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Ball Ball = new Ball();
        addObject(Ball, getWidth()/2, getHeight()/2);
        
        paddle paddle = new paddle("w", "s");
        addObject(paddle,getWidth()/26, getHeight()/2);
 
        paddle paddle1 = new paddle("up", "down");
        addObject(paddle1, 577, 200);
        
        addObject(new feature(), Greenfoot.getRandomNumber(getWidth()), 
        Greenfoot.getRandomNumber(getHeight()));
        
        addObject(new feature(), Greenfoot.getRandomNumber(getWidth()), 
        Greenfoot.getRandomNumber(getHeight()));
        
        addObject(new feature(), Greenfoot.getRandomNumber(getWidth()), 
        Greenfoot.getRandomNumber(getHeight()));
        
        addObject(new feature(), Greenfoot.getRandomNumber(getWidth()), 
        Greenfoot.getRandomNumber(getHeight()));
        
        addObject(new feature(), Greenfoot.getRandomNumber(getWidth()), 
        Greenfoot.getRandomNumber(getHeight()));
        
        addObject(new feature(), Greenfoot.getRandomNumber(getWidth()), 
        Greenfoot.getRandomNumber(getHeight()));
        
        showText("Player 1", 50, 25);
        showText("Player 2",550, 375);
    }
}
