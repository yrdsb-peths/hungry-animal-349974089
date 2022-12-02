import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class 熊 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class 熊 extends Actor
{
    /**
     * Act - do whatever the 熊 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("Left"))
        {
            move(-1);
        }
        if(Greenfoot.isKeyDown("Right"))
        {
            move(1);
        }
        
        removeTouching(苹果.class);
    }
}
