 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private GreenfootImage gameoverimage = new GreenfootImage("game_over.png");
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0; //mendefinisikan count yg dimulai dari nol
    public void act() 
    {
                
                
       control(); //mendifinisikan dulu baru dieksekusi pada baris dibawah
       
       Actor musuh = getOneIntersectingObject(Other_Car.class);
       if (musuh != null) {
           getWorld().removeObject(musuh);
           if (MyWorld.nyawa == 0){ //ketika nyawa bernilai 0 maka berenti dan muncul kata gameover
               Greenfoot.stop();
               testEndGame();
               getWorld().addObject(new GameOver(), 312,168);
           }else if (MyWorld.nyawa > 0){
               hancur(); //jika nyawa masih lebih dr 0 makanya nyawa akan terus berkurang ketika nabrak rintangan
               MyWorld.nyawa -= 1;
               MyWorld.lives.setLives(MyWorld.nyawa);
           }
       }
       
       
       }
       
    public void control() { //mengontrol gerak mobil
        if (getX()>=100 && getX()<=480) {
               if (Greenfoot.isKeyDown("left")) {
                   move(-3); 
                }
               if (Greenfoot.isKeyDown("right")) {
                   move(3); 
               }
               if (Greenfoot.isKeyDown("up")) {
                   setLocation(getX(),getY()-2); 
               }
               if (Greenfoot.isKeyDown("space")) {
                   setLocation(getX(),getY()+3); 
               }
            }
            else if (getX()<100){
                if (Greenfoot.isKeyDown("right")) {
                   move(3); 
               }
               if (Greenfoot.isKeyDown("up")) {
                   setLocation(getX(),getY()-2); 
               }
               if (Greenfoot.isKeyDown("space")) {
                   setLocation(getX(),getY()+3); 
               }
            }
            else {
               if (Greenfoot.isKeyDown("left")) {
                   move(-3); 
               }
                if (Greenfoot.isKeyDown("up")) {
                   setLocation(getX(),getY()-2); 
               }
               if (Greenfoot.isKeyDown("space")) {
                   setLocation(getX(),getY()+3); 
               }
        }
    }
    
    private void hancur(){
        getWorld().addObject(new Kuat(), getX(), getY());
        getWorld().removeObject(this);
    } // ketika mobil menabrak rintangan maka mobil akan tetep berjalan pada posisi X dan Y 
    //ketika dia menabrak rintangan tersebut.
    
    public void testEndGame() { 
        if (MyWorld.nyawa <= 0) {
            setImage(gameoverimage);
            setLocation(312,368);
            Greenfoot.stop();
        }
    } //menghentikan game ketika nyawa kurang dari sama dengan 0 dan mengentikan grennfoot 
    //dan juga memunculkan gambar image gameover yang sudah didefinisikan diatasnya yang ditempatkan pada 312,368.
}
