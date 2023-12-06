import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class capa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Capa extends World
{
    private int atraso = 50;
    /**
     * Constructor for objects of class capa.
     * 
     */
    public Capa()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
    }

    public void act()
    {
        if(atraso>0){
            atraso--;
        }
        else if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
            Dialogo world = new Dialogo();
            Greenfoot.setWorld(world);
        }
    }
}
   

