import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dialogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogo extends Capa
{

    private int atraso = 50;
    /**
     * Constructor for objects of class intro2.
     *
     */
    public Dialogo()
    {
    }
    public void act()
    {
        if(atraso>0){
            atraso--;
        }
        else if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
         Fundo world = new Fundo();
         Greenfoot.setWorld(world);
        }
    }
}