import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ciudad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ciudad extends World
{
    public static int score = 0;
    public static int punteo = 0;
    /**
     * Constructor for objects of class Ciudad.
     * 
     */
    public Ciudad()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        prepare();
    }
    
    public void act()
    {
        showText("Cafes:" +  score, 50, 25);
        showText("Burbujas:" +  punteo, 50, 40);
        if (Greenfoot.getRandomNumber(200)<1)
        {
            addObject(new Cafe(), Greenfoot.getRandomNumber(100), 65);
            addObject(new Burbuja(), Greenfoot.getRandomNumber(100), 65);
        }
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        score = 0;
        punteo = 0;
        Carro carro = new Carro();
        addObject(carro,72,436);
        Poli poli = new Poli();
        addObject(poli,100,100);
        Burbuja burbuja = new Burbuja();
        addObject(burbuja,320,155);
        Cafe cafe = new Cafe();
        addObject(cafe,434,256);
        Burbuja burbuja2 = new Burbuja();
        addObject(burbuja2,188,264);
        Burbuja burbuja3 = new Burbuja();
        addObject(burbuja3,390,401);
        Burbuja burbuja4 = new Burbuja();
        addObject(burbuja4,496,452);
        Burbuja burbuja5 = new Burbuja();
        addObject(burbuja5,541,383);
        Burbuja burbuja6 = new Burbuja();
        addObject(burbuja6,250,403);
        Burbuja burbuja7 = new Burbuja();
        addObject(burbuja7,128,371);
        Cafe cafe2 = new Cafe();
        addObject(cafe2,339,327);
        Cafe cafe3 = new Cafe();
        addObject(cafe3,327,435);
        Cafe cafe4 = new Cafe();
        addObject(cafe4,235,295);
        Cafe cafe5 = new Cafe();
        addObject(cafe5,148,163);
        Cafe cafe6 = new Cafe();
        addObject(cafe6,533,193);
    }
}
