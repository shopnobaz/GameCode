package GameCode;

import java.util.ArrayList;

public class Player {

    public String playerName;
    public int gameMoney;


   ArrayList<String> Animals; //This array stores the animals list the player have



//    public Player(){
//        Animals = new ArrayList<>(); // Initializing the array here.
//    }





    public Player(String playerName, int gameMoney){
        this.playerName=playerName;
        this.gameMoney= gameMoney;
        Animals = new ArrayList<>(); // Initializing the array here.


    }



    public int getGameMoney(){
        return this.gameMoney;

    }











        }