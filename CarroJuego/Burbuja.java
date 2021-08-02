import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burbuja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burbuja extends Actor
{
    /**
     * Act - do whatever the Burbuja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();// Add your action code here.
    }
    
    public void moveAround()
    {
        move(4);
        if( Greenfoot.getRandomNumber(100)< 10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5 )
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5 )
        {
            turn(180);
        }
        }
}
