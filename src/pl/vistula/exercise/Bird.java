package pl.vistula.exercise;

public class Bird extends Animal {

    private String featherColor;

    public Bird() {
        super();
        featherColor = "vvv";

    }

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(int age, String featherColor) {
        super(age);
        this.featherColor = featherColor;

    }

    public void drinkWater() {
        System.out.println("kua kua");
    }

    @Override

    public void getVoice() {
        System.out.println("Birds is making sounds");
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Birds is eating" + foodName);
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override

    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }
}
