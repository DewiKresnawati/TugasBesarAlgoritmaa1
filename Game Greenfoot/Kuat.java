import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kuat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kuat extends Actor
{
    /**
     * Act - do whatever the Kuat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //menginisialisasikan deathtimer dengan nilai pertama yaitu 0 dan juga menginisialisasi gambar Yaris.
    private int deathtimer = 0; 
    
    private GreenfootImage Yaris; 
    
    public Kuat() //k memunculkan gambar berupa mobil yaris
    {
        Yaris = getImage(); 
    }

    public void act() 
    {
        deathtimer++; //menambah 1 untuk setiap waktunya
        if (deathtimer > 40) {
            ((MyWorld) getWorld()).die();
            getWorld().removeObject(this);
        } else {
            setImage(Yaris);
        } //jika waktunya lebih dari 40 maka akan
        //menghilangkan object mobil yarisnya dan ketika salah atau nilainya kurang dari 40 maka akan
        //tetap memunculkan mobil yarisnya.
        }
}
