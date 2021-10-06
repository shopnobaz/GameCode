package GameCode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author jahed, nahid, shehab
 */



public class Player {

    private String name;
    public static int money = 1000;

    Scanner scan = new Scanner(System.in);


    ArrayList<Animal> AnimalList; //This array stores the animals list the player have
    ArrayList<Player> PlayerList;
    ArrayList<Food> FoodList;

    public Player(String name) {
        this.name = name;
        AnimalList = new ArrayList<>(); // Initializing the array here.
        PlayerList = new ArrayList<>();
        FoodList= new ArrayList<>();
    }


    public void createPlayerlist() {
        System.out.println("1. How many Player want to play? 2-4 ");
        int numberOfPlayers = scan.nextInt();
        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println(" Player name? ");
            String name = scan.next();
            Player players = new Player(name);
            PlayerList.add(players);
        }
        for (Player players : PlayerList) {
            System.out.println(players.name + " "+ "credit : " + players.money+  " "   + "Animal : " + AnimalList + "  Food :"  + FoodList );
        }
        animalChoice();
        }

    Cow cow1 = new Cow("", " ", 0, 0 );

    public void animalChoice() {
        System.out.println("1.Buy_Animal 2. Buy_Food 3. Feed_pet 4. Breeding 5. Sell_Animal");
        int animalChoice = scan.nextInt();
        if (animalChoice == 1) {
            System.out.println("1.Cow 2. Dog 3. Cat 4. Chicken 5. Bird");
        }
        int speciesChoice = scan.nextInt();
        if (speciesChoice == 1) {
            cow1.animalName("COW");
            System.out.println("Choose Gender: M or F");
            String genderChoice= scan.next();
            cow1.animalGender(genderChoice);
            cow1.animalPrice(100);
            cow1.animalHealth(100);
//            System.out.println("Name the Animal:   ");
//            String goru = scan.next();
            for (Animal animals : AnimalList) {
                System.out.println(animals.animalName );
            }
            AnimalList.add(cow1 );

          System.out.println( "Animal : " + AnimalList + "  Food :"  + FoodList );
//            purchaseAnimal();

        } else if (animalChoice == 2) {
            System.out.println("1.Meat 2. Vegetable 3. MixFood");
        } else if (animalChoice == 3) {
            System.out.println(" pet your animal");
        }
    }

//    public void purchaseAnimal(){
//         int playerMoney = 1000;
//         int animalPrice= 500;
//
//        for (Animal animals : AnimalList) {
//            System.out.println(animals.animalName );
//        }
//        AnimalList.add(cow1);
//        if (Player.money >= cow1.animalPrice) {
//            Player.money -= cow1.animalPrice;
//            AnimalList.add(cow1);
//        }
//    }






//    public void playerInfoBox() {
//
////        System.out.println("Player1 " + PlayerList.get(0) + " turn : "); System.out.println("Player1 " + PlayerList.get(0) + " turn : ");
//        System.out.println("Info Box:------- ");
//        System.out.println("Money:   ");
//        System.out.println("Animals:  ");
//        System.out.println("Animals Health: ");
//        System.out.println("Food info : ");
//        animalChoice();
//
//    }
















}


//    /**
//     * Field for the level of hunger of
//     * the animal.
//     */
//    private int hunger;
//
//    /**
//     * Constructor that sets the hunger
//     * of the animal to zero.
//     */
//    public Animal() {
//        hunger = 0;
//    }
//
//    /**
//     * Retrieves the hunger of the
//     * animal.
//     *
//     * @return hunger
//     */
//    public int getHunger() {
//        return hunger;
//    }
//    /**
//     * Method to make the animal
//     * speak.
//     */
//    public abstract void talk();
//
//    /**
//     * Adds times since the animal
//     * has eaten - increases hunger.
//     */
//    public void roundPasses() {
//        hunger++;
//    }
//
//    /**
//     * Feed the animal. Not hungry
//     * anymore.
//     */
//    public void feed() {
//        hunger = 0;
//    }
//
//    /**
//     * Sets the string representation of the
//     * class object.
//     */
//    public abstract String toString();
//}

//    /**
//     * Overrides the timePasses superclass
//     * method in order to have the lion
//     * pace when hunger reaches greater than
//     * 3.
//     */
//    public void roundPasses() {
//        super.roundPasses();
//        if (super.getHunger() >= 3) {
//            System.out.println("The lion paces hungrily.");
//        }
//    }
///**
//	 * Overrides the superclass method
//	 * to create the lion representation.
//	 */
//public String toString() {
//    return "Lion";
//}
//
//    /**
//     * Feed the animals in the zoo.
//     */
//    public void feedAll() {
//        if (cage1 instanceof Zebra || cage2 instanceof Zebra || cage3 instanceof Zebra) {
//            zebra.food();
//        }
//
//        if (cage1 instanceof Lion || cage2 instanceof Lion || cage3 instanceof Lion) {
//            lion.food();
//        }
//
//        if (cage1 instanceof Cheetah || cage2 instanceof Cheetah || cage3 instanceof Cheetah) {
//            cheetah.food();
//        }
//    }

//    /**
//     * Allow the animals to get hungry if they are in the zoo.
//     */
//    public void timePasses() {
//        if (cage1 instanceof Zebra || cage2 instanceof Zebra || cage3 instanceof Zebra) {
//            zebra.timePasses();
//        }
//
//        if (cage1 instanceof Lion || cage2 instanceof Lion || cage3 instanceof Lion) {
//            lion.timePasses();
//        }
//
//        if (cage1 instanceof Cheetah || cage2 instanceof Cheetah || cage3 instanceof Cheetah) {
//            cheetah.timePasses();
//        }
//    }

//    public void printAnimalName(Animal animal){
//        animal.printName();
//    }

//    Animal myAnimal = new Cat();
//myAnimal.setName("Stanley");
//myAnimal.printName();


//    Animal myAnimal = new Animal();
//myAnimal.setName("Mister Ed");
//
//    Cat myCat = new Cat();
//myCat.setName("Stanley");
//
//    printAnimalName(myAnimal);
//    printAnimalName(myCat);
//


//import java.util.ArrayList;

//    public abstract class Animal{
//
//        private String name;
//
//        public Animal(String name){
//            this.name = name;
//        }
//
//        public void printName(){
//            System.out.println("My name is: " + name);
//        }
//
//        public abstract void eat();
//    }
//
//
//    public class Frog extends Animal{
//
//        public Frog(String name){
//            super(name);
//        }
//
//        public void ribbit(){
//            System.out.println("Ribbit ribbit.");
//        }
//
//        @Override
//        public void eat(){
//            System.out.println("I crunch up a cricket.");
//        }
//    }











//
//    public class Zoo{
//
//        public static void feedAnimal(Animal animal){
//            animal.eat();
//        }
//
//        public static void main(String[] args){
//            ArrayList<Animal> animals = new ArrayList<Animal>();
//            animals.add(new Cat("Stanley"));
//            animals.add(new Dog("Clifford"));
//            animals.add(new Bird("Polly"));
//            animals.add(new Frog("Frank"));
//
//            for(int i = 0; i < animals.size(); i++){
//                Animal animal = animals.get(i);
//                feedAnimal(animal);
//            }
//        }
//    }




//
//    public void PlayerMenu() {
//        System.out.println("1. How many rounds Do you want to play? 5-30");
//        int playerRound = input.nextInt();
//        if (playerRound == 50) {
//            System.out.println("you are done");
//        } else {
//            System.out.println("continue");
//        }
//        //getGameRound();
//        System.out.println("1. How many Player want to play");
//        int playerSize = input.nextInt();
//        sortPlayerlist();
//
//    }







