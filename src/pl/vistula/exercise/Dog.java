package pl.vistula.exercise;

public class Dog extends Mammal {
    private String breed;

    Dog() {
        super();
        breed="vvv";
    }

    public Dog(String name, int age, int weight, String rzad, String breed){
        super(name, age,weight,rzad);
        this.breed=breed;
    }

    public Dog(int age, String rzad, String breed){
        super(age,rzad);
        this.breed=breed;
    }
    public void  gudeta56817() {System.out.println(" The dog is retrieving.");}

    @Override
    public void drinkMilk(){System.out.println("The dog is drinking milk.");}

    @Override
    public void  getVoice(){System.out.println("The dog is barking");}

    public void eat(String foodName){
        System.out.println("The dog is eating" + foodName);
    }

    public String  getBreed(){return breed;}

    public void setBreed(String breed){this.breed=breed;}

    @Override
    public String toString(){
        return "Dog{" +
                "breed='" +breed + '\'' +
                '}';
    }




}
