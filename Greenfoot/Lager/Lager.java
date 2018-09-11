import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lager extends Actor
{
    public Vare[] varer; 
    /**
     * Act - do whatever the Lager wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Vare hentVare()
    {
        return new Vare();
    }
}
