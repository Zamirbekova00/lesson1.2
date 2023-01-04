import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public String[] getCommands() {
        return commands;
    }

    public Dog(String name, String breed, String[] commands, ColourEnum colour, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(colour);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, ColourEnum colour, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(colour);
        super.setShelter(shelter);
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeVoice(){
        System.out.println("Гав гав");
    }

    public void makeVoice(String voice){
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommands: " + Arrays.toString(commands);
    }
}
