package GameCode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public Random random;
    public int gameRound;
    public String playerName;
    Scanner input = new Scanner(System.in);
    public String genderMarker;
    Cow goru= new Cow("" ,"", random);

    public Game(String playerName, int gameRound) {
        this.playerName=  playerName;
        this.gameRound = gameRound;
        PlayerList = new ArrayList<>(); // Initializing the array here.
    }


    //Player plyer1 = new Player("Jahed", 100);// Create player1 object from Player Class

    public void PlayerMenu() {
        System.out.println("1. How many rounds Do you want to play? give a number between 5-30");
        int playerRound = input.nextInt();
        if( playerRound == 50){
            System.out.println("you are done");
        }else {
            System.out.println("continue");
        }
        //getGameRound();
        System.out.println("1. How many Player want to play");
        String playerSize = input.next();
        sortPlayerlist();

    }


    ArrayList<String> PlayerList;

    public int sortPlayerlist() {
        int amountPlayers = input.nextInt();
        for (int i = 0; i < amountPlayers; i++) {
            System.out.println("What name? ");
            String playerName = input.next();
            Player player = new Player(playerName, 100);
            PlayerList.add(playerName);
            menuChoice ();
            int menuChoiceNumber = input.nextInt();
            animalChoice();
        }
        return amountPlayers;
    }


    public void setGameRound(int gameRound) {
        this.gameRound = gameRound;
    }

    public int getGameRound () {
            for (int gameRound = 0; gameRound < 50; gameRound++) {
                if (gameRound == 40) {
                    break;
                }
                System.out.println("your time is out");
            }
            return gameRound;
        }

        public void menuChoice () {
            System.out.println("1.Buy_Animal 2. Buy_Food 3. Feed_pet 4. Breeding 5. Sell_Animal");
        }

    public void animalChoice(){
        int animalChoice= input.nextInt();
        if( animalChoice==1 ){
        System.out.println("1.Cow 2. Dog 3. Cat 4. Chicken 5. Bird");}
        int speciesChoice= input.nextInt();
        if(speciesChoice== 1 ){
            goru.animalGender();

    }

        else if(animalChoice == 2){
            System.out.println("1.Meat 2. Vegetable 3. MixFood");
        } else if(animalChoice==3){
            System.out.println(" pet your animal");
        }
    }




}








