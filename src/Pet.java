import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private  ColourEnum colour;
    private Shelter shelter;

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public ColourEnum getColor() {
        return colour;
    }

    public void setColor(ColourEnum color) {
        this.colour = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public String getInfo() {
        return "Age: " + age +
                "\nColour: " + colour +
                "\nShelter name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }

}
