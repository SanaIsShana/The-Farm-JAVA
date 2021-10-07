
public class Farmer extends Person{
    Barn barn = new Barn();
    private int milkPot;


    public Farmer(String name){
        super(name);
        this.milkPot = 0;
    }

    public void milking(String cowToMilk){

        Cow c = (Cow) barn.getAnimals(cowToMilk);

        if (c.getTotalMilk() == 0){

                System.out.println(cowToMilk + " has no more milk!");
                return;
            }
        else {
                c.milkTheCow();
                this.milkPot += c.getMilkAmount();
            }


        System.out.println(cowToMilk + " has total " + c.getTotalMilk());
        System.out.println("You have " + this.milkPot + " in your milk pot!");

    }

}
