import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class 苹果 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class 苹果 extends Actor
{
    /**
     * Act - do whatever the 苹果 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY() + 1);
    }
}
