import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carro here.
 * 
 * @author (Hector de Leon) 
 * @version (Version 1, Entrega 25/07/21)
 */
public class Carro extends Actor
{
    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ciudad ciudad;
    private final int GRAVEDAD = 1;
    /*
     * GRAVEDAD es privado porque solo se quiere aplicar a Carro,
     * y es dinal, porque es constante, no cambia.
     */
    private int velocidad;
    /*
     * velocidad no es final porque la velocidad del Carro si cambia.
     */
    

    public Carro(){
        velocidad = 0;// Carro comienza no moviendose.
    }
    
    public void act()
    {
        moveAndTruth();
        eat();
        caer();
        saltar();
    }
    
    public void moveAndTruth()
    {
        int y = getY();//Se le asigna la vatiable y a la posicion y para 
        //guardarla temporalmente.
        int x = getX();//Se le asigna la vatiable x a la posicion x para 
        //guardarla temporalmente.
        if (Greenfoot.isKeyDown("right"))x += 3;//se mueve 1 posicion a la derecha.
        if (Greenfoot.isKeyDown("Left"))x -= 3;//se mueve 1 posicion a la izquierda
        if (Greenfoot.isKeyDown("up"))y--;
        if (Greenfoot.isKeyDown("down"))y++;
        setLocation(x,y); //Cambia su posicion en el juego a la siguiente.

    }    
    
    public void caer(){
        setLocation(getX(),getY()+ velocidad);//al caer cambia su posicion en Y.
        if(getY()> getWorld().getHeight() - 50) 
        velocidad = 0;//evita que caiga al abismo
        else velocidad += GRAVEDAD;
        /*
         * este metodo hace lo siguiente:
         * 1. cambia la posicion de Carro y le suma a Y la velocidad.
         * 2. si la posicion en y es mayor a -50 en el mundo, la velocidad es 0.
         * 3. de otra forma, la velocidad es igual a la gravedad + la velocidad
         * que tenia antes.
         * 
         * Esto crea el efecto de gravedad en el objeto.
         */
    }
    
    public void saltar(){
       if (Greenfoot.isKeyDown("Q") && getY()> getWorld().getHeight() - 50)
       velocidad = -20;
       /*
        * Este metodo hace que Carro salte cuando se presiona la barra espaciadora
        * El && añade otra condicion, que el carro solo puede saltar desde el "Suelo".
        */
    }
    
    
    // Los metodos siguientes dan la instruccion al auto de tomarse el cafe y 
    //explotar la burbuja.
    public void eat()
    {
        Actor Cafe;
        /*El siguiente metodo busca algun otro actor que esta tocando a nuestro 
        auto. los primeros parametros son los ejes x y y. Ambos estan en o ya que 
        queremos identificar objetos justo debajo de nosotros. El tercer
        parametro indica que objeto buscamos. A este metodo le asignamos la 
        variable Cafe.
        */
        Cafe = getOneObjectAtOffset(1,1,Cafe.class);
        /*
         La condicion if se lleva a cabo cuando la variable Cafe NO es null. 
         Esto significa que se activa cuando hay un objeto de clase Cafe
         debajo del carro
         */
        if (Cafe != null)
        {
            /*
             Esta parte del codigo se encarga de buscar al bojeto Cafe en el 
             mundo, y luego removerlo con el metodo removeObject.
             */
            World Ciudad;
            Ciudad = getWorld();
            Ciudad.removeObject(Cafe);
            Greenfoot.playSound("Coffee.wav");
            ciudad.score++;
        }
        
        Actor Burbuja;
        Burbuja = getOneObjectAtOffset(0,0,Burbuja.class);
        if (Burbuja != null)
        {
            World Ciudad;
            Ciudad = getWorld();
            Ciudad.removeObject(Burbuja);
            Greenfoot.playSound("Burbuja.wav");
            ciudad.punteo++;
        }
    }   
    
    
}
