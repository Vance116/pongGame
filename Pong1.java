import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pong1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pong1 extends Actor
{    
    private String pong1;
    private String pong2;
    public void act()
    {
        movement();
    }
    
    /**
     * Act - do whatever the Pong1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void movement()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 6);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 6);
            
        }
        
    }
    
    
}   

