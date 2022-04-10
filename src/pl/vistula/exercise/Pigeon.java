package pl.vistula.exercise;

public class Pigeon extends Bird {

    private String species;

    Pigeon() {
        super();
        species="vvv";
    }

    public Pigeon(String name, int age, int weight, String species){
        super(name, age,weight,species);
        this.species=species;
    }

    public Pigeon(int age, String species){
        super(age,species);
        this.species=species;
    }
    public void  gudeta56817() {System.out.println(" The pigeon is retrieving.");}

    @Override
    public void drinkWater(){System.out.println("The pigeon is drinking water.");}

    @Override
    public void  getVoice(){System.out.println("The pigeon is flying");}

    public void eat(String foodName){
        System.out.println("The pigeon is eating" + foodName);
    }

    public String  getSpecies(){return species;}

    public void setSpecies(String species){this.species=species;}

    @Override
    public String toString(){
        return "Pigeon{" +
                "species='" +species + '\'' +
                '}';
    }
}
