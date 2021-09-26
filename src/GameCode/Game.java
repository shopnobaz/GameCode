package GameCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public int gameRound;
    public String playerName;
    Scanner input = new Scanner(System.in);

    public Game(int gameRound) {
        this.gameRound = gameRound;
        PlayerList = new ArrayList<>(); // Initializing the array here.
    }

//    Player plyer1 = new Player("Jahed", 100);// Create player1 object from Player Class

    public void PlayerChocieRound() {
        System.out.println("1. How many rounds Do you want to play? give a number between 5-30");
        String playerRound = input.next();
        System.out.println("1. How many Player want to play");
        String playerSize = input.next();

    }


    ArrayList<String> PlayerList;

    public int sortPlayerlist() {
        int amountPlayers = input.nextInt();
        for (int i = 0; i < amountPlayers; i++) {
            System.out.println("What name? ");
            String playersName = input.next();
            Player player = new Player(playersName, 100);
            PlayerList.add(playersName);
        }
        return amountPlayers;
    }
    

        public int getGameRound () {
            for (int i = 0; i < 50; i++) {
                if (i == 40) {
                    break;
                }
            }
            return this.gameRound;
        }


        public void menuChoice () {
            System.out.println("1.Buy_Animal 2. Buy_Food 3. Feed_pet 4. Breeding 5. Sell_Animal");
            String playerRound = input.next();
        }
    }


//    public void addPlayers(String playerName) {
//        PlayerList.add(playerName);
//    }
//
//
//    public void sortPlayerlist() {
//        // Loop once time for every result stored in history
//        for( String PlayerList : playerName) {
//            System.out.println(playerName);
//        }
//    }


//    public Game( int gameRound){
//            this.gameRound = gameRound;
//        }





