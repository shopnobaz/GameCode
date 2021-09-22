package GameCode;

public class Cow extends Animal{

    public Cow(String animalName){
        super(animalName);
    }

    @Override
    public void animalGender(){
        System.out.println("male");
    }


    @Override
    public  void animalPrice(){
        System.out.println(500);
    }











}
