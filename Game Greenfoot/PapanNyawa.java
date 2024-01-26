import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PapanNyawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PapanNyawa extends Actor
{
    /**
     * Act - do whatever the PapanNyawa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PapanNyawa() 
    {
        //menampilkan tulisan score ke layar.
        GreenfootImage lives = new GreenfootImage(200,100);
        setImage(lives);
        
    }    
    
    public void setLives( int nyawa ){
        GreenfootImage lives = getImage();
        lives.clear();
        lives.setFont(lives.getFont().deriveFont(30f));
        lives.setColor(Color.RED);
        lives.drawString("Lives :" + nyawa,30,30);
        setImage(lives);
    } //membentuk tulisan Lives dengan warna Merah dengan ukuran font 30.
}    
