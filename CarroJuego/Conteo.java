import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Conteo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conteo extends World
{
    Ciudad ciudad;
    /**
     * Constructor for objects of class Conteo.
     * 
     */
    public Conteo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        generarMundo();
        act();
    
    }
    
    private void generarMundo()
    {
        addObject(new Space(), 300,150);
    }
    
    public void act()
    {
        
        
        showText("Tu puntuacion es", 100, 25);
        showText("Cafes:" +  ciudad.score, 100, 55);
        showText("Burbujas:" +  ciudad.punteo, 100, 85);
    
        if (Greenfoot.isKeyDown("space"))
            Greenfoot.setWorld(new Menu());
                    
                
            
    }
}
