package GameCode;

    public abstract class Food {
    public String foodName;
    public int foodAmount;

    public Food(String foodName) {
        this.foodName= foodName;
    }


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public Food(int foodAmount){
        this.foodAmount=foodAmount;
    }


    public void foodChoice(){
    if(foodName=="meat"){
        System.out.println("");
    }else if(foodName=="vegetalbe"){
        System.out.println("");
    } else{
        System.out.println("");
    }

    }












}
