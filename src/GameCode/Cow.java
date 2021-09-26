package GameCode;

public class Cow extends Animal{


//    @Override
//    public String getAnimalName() {
//        return animalName;
//    }

    @Override
    public void setAnimalName(String Cow) {
        this.animalName = Cow;
    }

    public String animalName;

//    public Cow(String animalName){
//        super(animalName);
//    }


    @Override
    public void animalGender(){
        System.out.println("male");
    }

    @Override
    public void animalRace() {
        System.out.println("Cow");

    }













}
