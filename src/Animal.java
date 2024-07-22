import java.util.Calendar;
import java.util.Date;

public class Animal {
    private String id;
    private String name;
    private String size;
    private int age;
    private Date yearRescue;
    private boolean hasSponsor;
    private Shelter shelter;

    protected Animal() {
        this("A000", "Animal", new Shelter());
    }
    protected Animal(String id, String name, Shelter shelter) {
        this.id = id;
        this.name = name;
        this.shelter = shelter;
    }

    public void createAnimal() {
        shelter.addAnimal(this);
    }
    // Overloading
    public void deleteAnimal() {
        shelter.removeAnimal(this);
    }
    public void deleteAnimal(String id) {
        Animal deletedAnimal = shelter.getAnimal(id);
        if(deletedAnimal != null) {
            shelter.removeAnimal(deletedAnimal);
        } else {
            System.out.println("Animal not found. Please try again.");
        }
    }

    public int calcRescuePeriod() {
        Date today = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int thisYear = cal.get(Calendar.YEAR);

        return thisYear - yearRescue.getYear();
    }

    @Override
    public String toString() {
        return  "\nID = " + id +
                "\nName = " + name +
                "\nSize = " + size +
                "\nAge = " + age +
                "\nYear Rescue = " + yearRescue +
                "\nHas Sponsor = " + hasSponsor +
                "\nShelter = " + shelter.getName();
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }
    public int getAge() {
        return age;
    }
    public Date getYearRescue() {
        return yearRescue;
    }
    public boolean isHasSponsor() {
        return hasSponsor;
    }
    public Shelter getShelter() {
        return shelter;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setYearRescue(Date yearRescue) {
        this.yearRescue = yearRescue;
    }
    public void setHasSponsor(boolean hasSponsor) {
        this.hasSponsor = hasSponsor;
    }
    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
}
