import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BabyWizard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BabyWizard extends Actor
{
    public int health;
    public int mana;
    private int counter=0;
    /**
     * Act - do whatever the BabyWizard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(counter%45==0)
            throwFireball();
        counter = counter +1;
        // Add your action code here.
    } 
    
    public void throwFireball()
    {
        Fireball baby = new Fireball();
        getWorld().addObject(baby, getX(), getY());
    }
}
