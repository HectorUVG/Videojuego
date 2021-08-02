import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    Flecha flecha= new Flecha();
    private int opcion = 0; 

    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        generarMundo();

        prepare();
    }

    private void generarMundo()
    {
        addObject(new Comenzar(), 300,150);
        addObject(new Salir(), 300, 250);
        addObject(flecha, 450, 150);
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("up") && opcion !=0)
        { opcion ++ ;}
        if (Greenfoot.isKeyDown("down") && opcion !=1)
        { opcion --;}

        if (opcion >= 2)
            opcion = 0;
        if(opcion < 0)
            opcion = 1;

        flecha.setLocation(450, 150 + (opcion*100));

        if (Greenfoot.isKeyDown("ENTER"))
        {
            switch(opcion)
            {
                case 0:
                    Greenfoot.setWorld(new Ciudad());
                    break;
                case 1:
                    Greenfoot.stop();
                    break;
            }
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
