package pl.vistula.exercise;

public class Mammal extends Animal {
    private String order;

    public Mammal(){
        super();
        order="vvv";

    }

    public Mammal(String name, int age , int weight, String order) {
        super(name, age, weight);
        this.order=order;
    }

    public Mammal(int age ,String order){
        super(age);
        this.order=order;

    }

    public void drinkMilk(){
        System.out.println("Siup Siup");
    }

    @Override

    public void getVoice(){ System.out.println("Mammals is making sounds");}

    @Override
    public void eat(String foodName){System.out.println("Mammals is eating" + foodName);}

    public String getOrder(){
        return order;
    }

    public void setOrder(String order){
        this.order=order;
    }
    @Override

    public String toString(){
        return "Mammal{" +
                "order='" + order + '\'' +
                '}';
    }
















}
