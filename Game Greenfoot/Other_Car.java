import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Other_Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Other_Car extends Actor
{
    /**
     * Act - do whatever the Other_Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count = 0;
    World world;
    public void act() 
    {
        // meletakkan lokasi mobil untuk pertama kali dan ketika program dirun
        //maka akan menghilangkan object yang ada di world..
        setLocation(getX(),getY()+2);
            world = getWorld();
            if (isAtEdge()) {
                world.removeObject(this);
            }
    }    
}
