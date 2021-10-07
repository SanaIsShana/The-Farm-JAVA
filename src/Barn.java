import java.util.ArrayList;

public class Barn {
    private ArrayList<Animal> animals = new ArrayList<>();
    private Animal a;

    public Barn(){
        animals.add(new Cow("Daisy"));
        animals.add(new Cow("Julia"));
        animals.add(new Cow("Greta"));
    }

    public Animal getAnimals(String cowToMilk) {


        for (Animal animal : animals) {
            if (animal.getName().equals(cowToMilk))
                a = animal;
        }
        return a;
    }
}

