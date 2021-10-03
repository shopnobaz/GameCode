package GameCode;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Game {
    Scanner scan = new Scanner(System.in);
    Player player = new Player("");


    public Game() {
        player.createPlayerlist();

        }
    }











//    public Random random;
//    public int gameRound;
//    public String playerName;
//    Scanner input = new Scanner(System.in);
//    public String genderMarker;
//    Store dokan = new Store();
//    Cow goru = new Cow("Goru", "M", 100, 100);
//


//
//    public Game(String playerName, int gameRound) {
//        this.playerName = playerName;
//        this.gameRound = gameRound;
//        PlayerList = new ArrayList<>(); // Initializing the array here.
//    }



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



//    ArrayList<Player> PlayerList = new ArrayList<>();



    //
//
//
//    public void sortPlayerlist() {
//        System.out.println("1. How many Player want to play? 2-4 ");
//        int fixedPlayers = 5;
//        int playerInput = input.nextInt();
//        for (playerInput = 1; playerInput < fixedPlayers; playerInput++) {
//            System.out.println("First Player name? ");
//            String playerOne = input.next();
//            Player player1 = new Player(playerOne, 100);
//            System.out.println("Second Player name? ");
//            String playerTwo = input.next();
//            Player player2 = new Player(playerTwo, 100);
//            PlayerList.add(playerOne);
//            PlayerList.add(playerTwo);
//            System.out.println("Two Players are created. Lets play the game");
//            printPlayerList();
//            playerTurn();
//
//            if (playerInput == fixedPlayers)
//                break;
//
//            playerTurn();
//
//        }
////        return playerInput;
//    }

    //    public void addMatchToHistory(String PlayerOne, String PlayerTwo)
//    {
//        PlayerList.add(PlayerOne);
//        PlayerList.add(PlayerTwo);
//    }


//    public void printPlayerList() {
//        // Loop once time for every result stored in history
//        for( String playerName : PlayerList) {
//            System.out.println(playerName);
//        }
//    }

//    public void playerTurn() {
//        System.out.println("Player1 " + PlayerList.get(0) + " turn : ");
//        System.out.println("Info Box:------- ");
//        System.out.println("Money:   ");
//        System.out.println("Animals:  ");
//        System.out.println("Animals Health: ");
//        System.out.println("Food info : ");
//        animalChoice();
//    }
//
//
//    public void animalChoice() {
//        System.out.println("1.Buy_Animal 2. Buy_Food 3. Feed_pet 4. Breeding 5. Sell_Animal");
//        int animalChoice = input.nextInt();
//        if (animalChoice == 1) {
//            System.out.println("1.Cow 2. Dog 3. Cat 4. Chicken 5. Bird");
//        }
//        int speciesChoice = input.nextInt();
//        if (speciesChoice == 1) {
//            goru.animalName("COW");
//            goru.animalGender("M");
//        } else if (animalChoice == 2) {
//            System.out.println("1.Meat 2. Vegetable 3. MixFood");
//        } else if (animalChoice == 3) {
//            System.out.println(" pet your animal");
//        }
//    }
//
//
//
//
//
//
////Player plyer1 = new Player("Jahed", 100);// Create player1 object from Player Class
////    public void setGameRound(int gameRound) {
////        this.gameRound = gameRound;
////    }
//
////    public int getGameRound () {
////            for (int gameRound = 0; gameRound < 50; gameRound++) {
////                if (gameRound == 40) {
////                    break;
////                }
////                System.out.println("your time is out");
////            }
////            return gameRound;
////        }
////
////        public void menuChoice () {
////            System.out.println("1.Buy_Animal 2. Buy_Food 3. Feed_pet 4. Breeding 5. Sell_Animal");
////        }
//
////    String playerName = input.next();
////            Player player = new Player("playerName", 100);
//
//
////
////    public static void feedAnimal(Animal animal){
////        animal.eat();
////    }
////
////    public static void main(String[] args){
////        ArrayList<Animal> animals = new ArrayList<Animal>();
////        animals.add(new Cat("Stanley"));
////        animals.add(new Dog("Clifford"));
////        animals.add(new Bird("Polly"));
////        animals.add(new Frog("Frank"));
////
////        for(int i = 0; i < animals.size(); i++){
////            Animal animal = animals.get(i);
////            feedAnimal(animal);
////        }
////    }