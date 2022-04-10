package pl.vistula.exercise;

public class Fish extends Animal{

    private String scaleColor;

    public Fish() {
        super();
        scaleColor = "vvv";

    }

    public Fish(String name, int age, int weight, String scaleColor) {
        super(name, age, weight );
        this.scaleColor= scaleColor;
    }

    public Fish(int age, String scaleColor) {
        super(age);
        this.scaleColor =scaleColor;

    }

    public void drinkWater() {
        System.out.println("click, click");
    }

    @Override

    public void getVoice() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Fish is eating" + foodName);
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override

    public String toString() {
        return "Fish{" +
                "scaleColor='" + scaleColor + '\'' +
                '}';
    }
}
