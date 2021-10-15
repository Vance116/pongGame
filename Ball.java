import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 */
public class Ball extends Actor
{
    private int dX = 4;
    private int dY = 4;
    public int score1 = 0;
    public int score2 = 0;
    private GreenfootImage gameOver;
    private GreenfootImage gameOver2;
    /**
     * used to set image, used same method as used in crab game
     */
    public Ball()
    {
        gameOver = new GreenfootImage("pixil-frame-0 .png");
        gameOver2 = new GreenfootImage("pixil-frame-0 (2).png");
    }

    /**
     * declars methods
     */
    public void act()
    {
        move();
        checkForBounce();
        counter();
        checkForPaddle();
    }

    /**
     * Movement for the ball
     */
    public void move()
    {
        setLocation(getX() + dX,getY() + dY);
    }

    /**
     * enacts what happens when the ball touches the paddles etc.
     * also added sound
     */
    public void checkForBounce()
    {
        if (getX() >= getWorld().getWidth() - 1) 
        {
            setLocation(getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.playSound("Hit_Hurt19.wav");
            Greenfoot.delay(45);
            score1++;
            Greenfoot.setSpeed(50);
        }

        if (getX() <= 0)
        {
            setLocation(getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.playSound("Hit_Hurt19.wav");
            Greenfoot.delay(45);
            score2++;
            Greenfoot.setSpeed(50);
        }

        if (getY() <= 0 || getY() >= getWorld().getHeight() - 1)
        {
            dY = -dY;
        }
        /**
         * Makes ball speed up
         */
        if(isTouching(feature.class))
        {
            removeTouching(feature.class);
            Greenfoot.setSpeed(55);
            Greenfoot.playSound("Pickup_Coin38.wav");
        }
        //(isTouching(paddle.class))
        //{
        //    Greenfoot.delay(2);
        //}
    }

    /**
     * stops the game when one of the players reaches 8 points
     */
    public void counter()
    { 
        if(score1 >= 8 || score2 >= 8)
        {
            Greenfoot.stop();
        }
        if(score1 >= 8)
        {
            setImage(gameOver);
        }
        if(score2 >= 8)
        {
            setImage(gameOver2);
        }
    }
    /**
     * moved the paddle touch out of the "checkForBounce" method
     */
    public void checkForPaddle()
    {
        if(isTouching(paddle.class))
        {
            dX = -dX;
            Greenfoot.playSound("Powerup.wav");
            Greenfoot.delay(2);
        }
    }
}

