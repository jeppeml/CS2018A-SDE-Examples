import greenfoot.*; 
public class Baby extends Actor
{
    public String name="Ludvig Brian";
    public String gender;
    public String bdate;
    public boolean isAlive=true;
    public boolean isHungry=true;
    public boolean isTired=true;
    public boolean diaperIsFull=false;
    
    private boolean goingLeft = false;
    private int countActs = 0;
    
    public void act()
    {
        if(isTouching(Food.class))
        {
            consume((Food)getOneIntersectingObject(Food.class));
        }
        if(isHungry)
        {
            cry();
        }
        else if(isTired)
        {
            cry();
        }
        else if(diaperIsFull)
        {
            cry();
        }
        crawl();
        countActs = countActs +1;
        
    }
    
    public void cry()
    {
        if(goingLeft)
        {
            turn(-10);
        }
        else
        {
            turn(10);
        }
        goingLeft = !goingLeft;
        
    }
    
    public void consume(Food food)
    {
        getWorld().removeObject(food);
        isHungry=false;
    }
    
    public void sleep()
    {
        isTired = false;
    }
    
    public void crawl()
    {
        if(countActs % 30 == 0)
        {
            turn(Greenfoot.getRandomNumber(360));
        }
        move(3);
    }
}
