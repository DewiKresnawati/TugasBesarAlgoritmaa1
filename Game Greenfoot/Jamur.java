import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jamur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jamur extends Actor
{
    /**
     * Act - do whatever the Jamur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world;
    public void act() 
    {
         setLocation(getX(),getY()+4); //meletakkan lokasi mobil ketika mobil bersentuhan ke object lain yaitu
        //dari mobil.class maka akan menghilang.
         Actor mobil = getOneIntersectingObject(Car.class);
         world = getWorld();
         if (isAtEdge()) {  //mendeteksi apakah aktor telah mencapai tepi dunia.
           world.removeObject(this);
         }
         if(mobil != null){
            getWorld().removeObject(this);
            MyWorld.score+=1;
            MyWorld.scores.setScore(MyWorld.score);
         } //menghilangkan mobil dan menambah nilai
        // dengan nilai 1 dari score yang ada di MyWorld dan juga scorenya dimulai dari score yang sudah
        //ditentukan di MyWorld.
    }    
}
