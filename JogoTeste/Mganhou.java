import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mganhou here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mganhou extends World
{
    private int atraso = 500;
    /**
     * Constructor for objects of class Mganhou.
     * 
     */
    public Mganhou()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act()
    {
        if(atraso>0){
            atraso--;
        }
        else if (atraso == 0){
         Credito world = new Credito();
         Greenfoot.setWorld(world);
        }
}
}
