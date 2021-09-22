package GameCode;

public class Player {

   public int gameRound;
   public int gameMoney;

public Player(int gameround, int gameMoney){
    this.gameRound= gameRound;
    this.gameMoney= gameMoney;

}

  public int getGameMoney(){
        int number= 50 ;
     this.gameMoney= number;
      return number;

  }


    public int getGameRound(){
        int number= 50 ;
        for(int i=0; i<50; i++){
            if (i== 40){
                break;
            }
        this.gameRound= number;}
        return number;
    }










        }