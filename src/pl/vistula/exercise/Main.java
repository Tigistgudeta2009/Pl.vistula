package pl.vistula.exercise;

public class Main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6] ;

        animal[0] = new Mammal();
        animal[1] = new Dog();
        animal[2] = new Bird();
        animal[3] = new Pigeon();
        animal[4] = new Fish();
        animal[5] = new Blowfish();


       animal[1].getVoice();
        animal[2].getVoice();
    }
}
