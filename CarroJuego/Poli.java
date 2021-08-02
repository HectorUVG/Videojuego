import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poli here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poli extends Actor
{
    /**
     * Act - do whatever the Poli wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();// Add your action code here.
    }
    
    public void moveAround()
    {
        move(-4);
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
        
          public void eat()
    {
        Actor Carro;
        Carro = getOneObjectAtOffset(0,0,Carro.class);
        if (Carro != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Carro);
            Greenfoot.playSound("error.wav");
            Greenfoot.setWorld(new Conteo());
            //break;
        }
    }
}
