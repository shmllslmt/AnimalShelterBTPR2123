import java.util.ArrayList;

public class Shelter {
    private String id;
    private String name;
    private String address;
    private ArrayList<Animal> animals;

    protected Shelter() {
        this("S000", "Animal Shelter", "Johor");
    }
    protected Shelter(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.animals = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void addAnimal(Animal animal) {
        if(animal != null) {
            animals.add(animal);
            System.out.println("Meet " + animal.getName() + "! Our latest addition in the animal shelter.");
        }
    }
    public void removeAnimal(Animal animal) {
        if(animals.contains(animal)) {
            animals.remove(animal);
            System.out.println(animal.getName() + " has been removed from the animal shelter.");
        } else {
            System.out.println(animal.getName() + " is not even in the animal shelter. Please try again.");
        }
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
    public Animal getAnimal(String id) {
        for(Animal a: animals) {
            if(a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }
}
