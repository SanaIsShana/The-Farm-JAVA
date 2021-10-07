
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Farmer farmer = new Farmer("Peter");
        String cowToMilk = "";
        int option1;
        int option2 = 1;

        while (option2 !=2){
            System.out.println("Choose the cow that you want to milk: ");
            System.out.println("1.Daisy 2.Julia 3.Greta");
            option1 = scan.nextInt();
            switch (option1){
                case 1:
                    cowToMilk = "Daisy";
                    break;
                case 2:
                    cowToMilk = "Julia";
                    break;
                case 3:
                    cowToMilk = "Greta";
                    break;
            }
            farmer.milking(cowToMilk);
            System.out.println("Would like to continue milking? 1.y/2.n");
            option2 = scan.nextInt();
        }
    }
}
