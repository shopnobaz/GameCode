package GameCode;

import java.util.Random;

public class Cow extends Animal{
    public Cow(String animalName, String animalGender, Random random) {
        super(animalName, animalGender,random);
    }

//    public Random random;
    Random random= new Random();
    public int genderMarker;

    @Override
    public void animalGender(){
//        int upperbound = 2;
//        int genderMarker = random.nextInt(upperbound);
//        if (genderMarker == 0) {
//            System.out.println("Male" );
//        } else {
//            System.out.println("Female");
//        }
////        this.genderMarker= genderMarker;
    }

//    public int getGenderChoice(){
//        return genderMarker;
//    }
    @Override
    public void animalRace() {
        System.out.println("Cow");

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


    /**
     * Overrides the superclass method
     * to create the zebra representation.
     */
    public String toString() {
        return "Cow";
    }


}
