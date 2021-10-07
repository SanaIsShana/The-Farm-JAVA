public class Cow extends Animal{
    private int milkAmount;
    private int totalMilk;

    public Cow(String name){
        super(name);
        this.totalMilk = 30;
        this.milkAmount = 10;
    }

    public int getMilkAmount() {
        return milkAmount;
    }

    public int getTotalMilk() {
        return totalMilk;
    }

    public int milkTheCow(){

        while (this.totalMilk !=0 ){
        this.totalMilk -= this.milkAmount;
        break;
        }
        return totalMilk;
    }
}
