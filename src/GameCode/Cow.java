package GameCode;

import java.util.Random;

public class Cow extends Animal{
    public Cow(String animalName, String animalGender, int sellPrice, int animalHealth) {
        super(animalName, animalGender, sellPrice, animalHealth);
    }


    @Override
    public void animalGender(String animalGender){
        if( animalGender== "M"){
        System.out.println("Male");}
      else if( animalGender== "F"){
          System.out.println("Female");
      }
   }



    @Override
    public void animalName(String animalName) {
        System.out.println("Cow");

    }
    public String getAnimalName() {
        return animalName;

    }
    @Override
    public  void animalHealth(int animalHealth){

    }

    @Override
    public void animalPrice(int sellPrice) {

    }


    /**
     * Overrides the superclass method
     * to create the zebra representation.
     */
    public String toString() {
        return "Cow";
    }


}
