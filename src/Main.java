public class Main {
    public static void main(String[] args) {
        String[] commands = {"Лежать", "Сидеть"};
        Shelter shelter = new Shelter("Sun", "Lenina 1");

        Dog dog = new Dog("Rex", "Ovcharka", commands, ColourEnum.BROWN, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гав гав");
        dog.makeVoice("Гув гув");

        System.out.println("--------------------------");

        Shelter shel = new Shelter("Moon", "Frunze");
        Dog dog1 =new Dog("Bobi", "Chihuaha", ColourEnum.BLACK,shelter );
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Uuuu");
        dog.makeVoice("Auu");
    }
}