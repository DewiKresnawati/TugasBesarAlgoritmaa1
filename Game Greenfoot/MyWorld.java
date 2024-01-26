import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int count = 0; //menentukan terlebih dahulu nilai
    static int nyawa = 3;
    static int score = 0;
    static PapanScore scores = null;
    static PapanNyawa lives = null;
    Car car = new Car();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a myWorld
        super(600, 400, 1); 
        setPaintOrder(PapanNyawa.class, PapanScore.class,GameOver.class,Car.class,Other_Car.class,Jamur.class,Jalan.class,Kaktus.class,Batu.class,Background.class);
        //mendefinisikan semua class yg ada
        scores = new PapanScore(); //menentukan nilai scorenya
        addObject(scores,486,50); 
        scores.setScore(0);
        
        lives = new PapanNyawa(); //menentukan nilai nyawa yaitu 3
        addObject(lives,85,54); 
        lives.setLives(nyawa);
        
        prepare();
    }
    
    public void act(){

        count++; // menambahkan nilai dari hasil count terakhir.
        
        if (score < 20){
            if (count==80) {
                summonCar();
                summonFlower();
                count=0;
           }
        }
        
        if (score == 10) {
           
           Greenfoot.playSound("Yayy.wav");
           Greenfoot.stop();
        }
    }
    
    private void prepare()
    {
        //meletakkan semua objek yg ada dan digunakan
        Jalan jalan = new Jalan();
        addObject(jalan, 290, 37);
        Jalan jalan2 = new Jalan();
        addObject(jalan2, 298, 114);
        jalan2.setLocation(290, 106);
        Jalan jalan3 = new Jalan();
        addObject(jalan3, 295, 199);
        jalan3.setLocation(290, 179);
        Jalan jalan4 = new Jalan();
        addObject(jalan4, 300, 252);
        jalan4.setLocation(291, 248);
        Jalan jalan5 = new Jalan();
        addObject(jalan5, 348, 306);
        jalan5.setLocation(292, 315);
        Jalan jalan6 = new Jalan();
        addObject(jalan6, 298, 389);
        jalan6.setLocation(293, 380);
        jalan.setLocation(289, 25);
        jalan2.setLocation(289, 76);
        Jalan jalan7 = new Jalan();
        addObject(jalan7, 364, 159);
        jalan5.setLocation(293, 330);
        jalan4.setLocation(293, 281);
        jalan3.setLocation(293, 231);
        jalan2.setLocation(289, 75);
        jalan7.setLocation(289, 125);
        Jalan jalan8 = new Jalan();
        addObject(jalan8, 295, 183);
        jalan8.setLocation(289, 174);
        jalan3.setLocation(288, 224);
        jalan3.setLocation(289, 224);
        jalan4.setLocation(289, 274);
        jalan5.setLocation(288, 323);
        jalan5.setLocation(289, 324);
        jalan6.setLocation(289, 374);
        Kaktus kaktus = new Kaktus();
        addObject(kaktus, 443, 86);
        Kaktus kaktus2 = new Kaktus();
        addObject(kaktus2, 521, 245);
        Kaktus kaktus3 = new Kaktus();
        addObject(kaktus3, 106, 123);
        Kaktus kaktus4 = new Kaktus();
        addObject(kaktus4, 153, 231);
        Kaktus kaktus5 = new Kaktus();
        addObject(kaktus5, 68, 351);
        Kaktus kaktus6 = new Kaktus();
        addObject(kaktus6, 389, 200);
        Kaktus kaktus7 = new Kaktus();
        addObject(kaktus7, 507, 356);
        Kaktus kaktus8 = new Kaktus();
        addObject(kaktus8, 32, 45);
        addObject(car, 300, 363);
        car.setLocation(292, 359);
        Kaktus kaktus9 = new Kaktus();
        addObject(kaktus9, 567, 53);
        Other_Car other_car = new Other_Car();
        addObject(other_car, 143, 72);
        jalan8.setLocation(289, 175);
        jalan3.setLocation(289, 225);
        jalan4.setLocation(289, 275);
        car.setLocation(200, 358);
        jalan5.setLocation(289, 325);
        jalan6.setLocation(289, 375);
        car.setLocation(291, 360);
        car.setLocation(221, 349);
        removeObject(car);
        Car car2 = new Car();
        addObject(car2, 342, 347);
        car2.setLocation(297, 359);
        kaktus6.setLocation(531, 164);
        Background background = new Background();
        addObject(background, 154, 40);
        background.setLocation(142, 24);
        Background background2 = new Background();
        addObject(background2, 153, 98);
        background2.setLocation(142, 74);
        Background background3 = new Background();
        addObject(background3, 165, 179);
        background3.setLocation(142, 124);
        Background background4 = new Background();
        addObject(background4, 142, 269);
        background4.setLocation(132, 179);
        Background background5 = new Background();
        addObject(background5, 93, 294);
        background5.setLocation(142, 224);
        Background background6 = new Background();
        addObject(background6, 226, 352);
        background6.setLocation(142, 274);
        Background background7 = new Background();
        addObject(background7, 459, 363);
        background7.setLocation(142, 324);
        Background background8 = new Background();
        addObject(background8, 440, 315);
        background8.setLocation(142, 374);
        Background background9 = new Background();
        addObject(background9, 154, 40);
        background9.setLocation(463, 24);
        Background background10 = new Background();
        addObject(background10, 153, 98);
        background10.setLocation(463, 74);
        Background background11 = new Background();
        addObject(background11, 165, 179);
        background11.setLocation(463, 124);
        Background background12 = new Background();
        addObject(background12, 142, 269);
        background12.setLocation(463, 179);
        Background background13 = new Background();
        addObject(background13, 93, 294);
        background13.setLocation(463, 224);
        Background background14 = new Background();
        addObject(background14, 226, 352);
        background14.setLocation(463, 274);
        Background background15 = new Background();
        addObject(background15, 459, 363);
        background15.setLocation(463, 324);
        Background background16 = new Background();
        addObject(background16, 440, 315);
        background16.setLocation(463, 374);
        Batu batu = new Batu();
        addObject(batu, 450, 162);
        Batu batu2 = new Batu();
        addObject(batu2, 42, 209);
        Batu batu3 = new Batu();
        addObject(batu3, 151, 378);
        //GameOver gameOver = new GameOver();
        //addObject(gameOver,313,168);
        //removeObject(gameOver);
    }
    
    public void summonCar(){
           addObject(new Other_Car(),Greenfoot.getRandomNumber(380)+100,0);
    } //membuat objek other.car bergerak random
        
    public void summonFlower(){
            addObject(new Jamur(),Greenfoot.getRandomNumber(380)+100,0);
    } //membuat jamur bergerak random
    
    public void die(){
        addObject(car,300, 363);
    } //menambahkan objek car diposisi 300x dan 363y
    
}

