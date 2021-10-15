import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
Movent for both paddle (abstraction)
 */
public class paddle extends Actor
{
    private String upKey;
    private String downKey;
    private int moveUp = -6;
    private int moveDown = 6;
    /**
     * figured out how to do abstraction, didnt realize that you could use the world
     */
    public void act()
    {
        isKeyDown();
    }
    public void isKeyDown()
    {
    if(Greenfoot.isKeyDown(upKey))
    {
        setLocation(getX(), getY() + moveUp);
    }
    if(Greenfoot.isKeyDown(downKey))
    {
        setLocation(getX(), getY() + moveDown);    
    }
    }
    public paddle(String upKey, String downKey)
    {
        this.upKey = upKey;
        this.downKey = downKey;
    }
    
    
}
