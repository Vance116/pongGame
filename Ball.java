import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    
    private int dX = 4;
    private int dY = 4;
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        checkForBounce();
    }
    public void move()
    {
        setLocation(getX() + dX,getY() + dY);
    }
    
    public void checkForBounce()
    {
        if (getX() <= 0 || getX() >= getWorld().getWidth() - 1) 
        {
            setLocation(getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.playSound("Hit_Hurt19.wav");
        }
        
        if (getY() <= 0 || getY() >= getWorld().getHeight() - 1)
        {
            dY = -dY;
        }
        
        if(isTouching(Pong1.class))
        {
         dX = -dX;  
         Greenfoot.playSound("Powerup.wav");
        }
           if(isTouching(Pong2.class))
        {
         dX = -dX;   
         Greenfoot.playSound("Powerup.wav");
        }
        
    }
    

   
}

