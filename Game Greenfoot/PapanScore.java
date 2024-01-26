import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PapanScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PapanScore extends Actor
{
    /**
     * Act - do whatever the PapanScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PapanScore() 
    {
        // Add your action code here.
        GreenfootImage skor = new GreenfootImage(200,100);
        setImage(skor);
        
    }    
    
    public void setScore( int score ){ //untuk membuat
    //tulisan Score dengan warna Merah dengan ukuran 30.
        GreenfootImage skor = getImage();
        skor.clear();
        skor.setFont(skor.getFont().deriveFont(30f));
        skor.setColor(Color.RED);
        skor.drawString("Score :" + score,30,30);
        setImage(skor);
    }
}
