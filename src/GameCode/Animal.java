package GameCode;

import java.util.Random;

public abstract class Animal {
    public String animalName;
    public String animalGender;
    public int animalHealth;
    public int animalPrice;
    public Random random;    // we use this built in random option to generate random numbers.

    public Animal(String animalName,String animalGender, int animalHealth, int animalPrice){
        this.animalName= animalName;
        this.animalGender= animalGender;
        this.animalHealth= animalHealth;
        this.animalPrice= animalPrice;
    }


//    public Animal(int animalHealth){
//         this.animalHealth= animalHealth;
//    }



    public abstract void animalGender(String animalGender);

    public abstract  void animalName(String animalName);

    public abstract void animalHealth(int animalHealth);
    public abstract void animalPrice(int animalPrice);



//    List<Animal> animals = new ArrayList<Animal>(3);
//animals.add(new Horse());
//animals.add(new Cow());
//animals.add(new Pig());
//
//for (Animal animal : animals) {
//        animal.eat();
//    }












}
