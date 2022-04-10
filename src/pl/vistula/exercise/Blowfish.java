package pl.vistula.exercise;

public class Blowfish extends Fish {

    private String diameter;

    Blowfish() {
        super();
        diameter="vvv";
    }

    public Blowfish(String name, int age, int weight, String diameter){
        super(name, age,weight,diameter);
        this.diameter=diameter;
    }

    public Blowfish(int age, String diameter){
        super(age,diameter);
        this.diameter=diameter;
    }
    public void  gudeta56817() {System.out.println(" The blowfish is retrieving.");}

    @Override
    public void drinkWater(){System.out.println("The blowfish is drinking water.");}

    @Override
    public void  getVoice(){System.out.println("The blowfish is swimming");}

    public void eat(String foodName){
        System.out.println("The blowfish is eating" + foodName);
    }

    public String  getDiameter(){return diameter;}

    public void setDiameter(String diameter){this.diameter=diameter;}

    @Override
    public String toString(){
        return "Blowfish{" +
                "diameter='" +diameter + '\'' +
                '}';
    }
}
