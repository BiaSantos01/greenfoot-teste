import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fundo extends World
{

  private GreenfootSound bgMusic = new GreenfootSound("mario.mp3");
   
   
    public void started()
    {
        bgMusic.playLoop();
    }
   
    public void stopped()
    {
        bgMusic.pause();
    }

    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public Fundo ()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
   
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Wario wario = new Wario();
        addObject(wario,291,430);
        Mario mario = new Mario();
        addObject(mario,530,448);
        wario.setLocation(405,452);
        wario.setLocation(453,421);
        removeObject(wario);
        removeObject(mario);
        addObject(wario,132,431);
        addObject(mario,467,373);
        mario.setLocation(569,372);
        Counter counter = new Counter();
        addObject(counter,246,23);
        Counter2 counter2 = new Counter2();
        addObject(counter2,559,40);
        counter.setLocation(644,41);
        counter2.setLocation(255,31);
        counter.setLocation(632,25);
        counter2.setLocation(565,40);
        counter.setLocation(253,51);
    }

    public void act(){
       
    started();
    }
}