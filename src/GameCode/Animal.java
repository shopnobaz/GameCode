package GameCode;

import java.util.Random;

public abstract class Animal {
    public String animalName;
    public String animalGender;
    public int animalHealth;
    public Random random;    // we use this built in random option to generate random numbers.

    public Animal(String animalName,String animalGender, Random random){
        this.animalName= animalName;
        this.animalGender= animalGender;
        this.random= new Random();
    }


//    public Animal(int animalHealth){
//         this.animalHealth= animalHealth;
//    }

    public Animal() {

    }

    public abstract void animalGender();

    public abstract void animalRace();

    public abstract  void setAnimalName(String animalName);

    public abstract void animalHealth(int animalHealth);



//    public String getAnimalName() {
//        return animalName;
//    }












}
