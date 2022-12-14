import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class 苹果 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class 苹果 extends Actor
{
    int speed = 1;
    
    
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x,y);
        
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
