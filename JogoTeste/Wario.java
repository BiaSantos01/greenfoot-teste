import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wario extends Actor
{
    GreenfootSound poderW = new GreenfootSound("eletric2.mp3");
    public int speed = 1;
    public int vidas = 10;
    /**
     * Act - do whatever the Luigi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
   
    {
        movimento();
        acertarAlvo();// Add your action code here.
    }
    private int sTimer = 0;
    public void movimento(){
       
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("l") && (sTimer == 0)){
           
            sTimer ++;
            poderW.play();
            poderW.setVolume(100);
            getWorld().addObject(new PoderW(), getX() + 150, getY() + 0);
        }
        else{
            if (!Greenfoot.isKeyDown("l")){
                sTimer = 0;
            }
        }
    }
    public void acertarAlvo(){
    Actor b = getOneIntersectingObject(PoderM.class);
   
    if (b != null) {
    Counter2 counter2= (Counter2) getWorld().getObjects(Counter2.class).get(0);
    counter2.add(1);
    vidas -=1;
     getWorld().removeObject(b);
     } else if(vidas == 0 ){
        getWorld().removeObject(this);
        sTimer = 10;
        Mganhou world = new Mganhou();
        Greenfoot.setWorld(world);
     }
    }
}
