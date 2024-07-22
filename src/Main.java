import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Shelter caresjb = new Shelter("S001", "Cares JB", "Johor Bahru");

        Cat mimi = new Cat("A001", "Mimi", caresjb, true);
        Animal mumu = new Animal("A002", "Mumu", caresjb);
        Animal meme = new Cat("A003", "Meme", caresjb, true);
        Animal momo = new Animal("A004", "Momo", caresjb);
        Animal mama = new Animal("A005", "Mama", caresjb);

        if(mimi instanceof Animal)
            System.out.println(mimi.getName() + " is an instance of Animal");
        if(mimi instanceof Cat)
            System.out.println(mimi.getName() + " is an instance of Cat");

        mimi.createAnimal();
        mumu.createAnimal();
        momo.createAnimal();

        mama.deleteAnimal();
        momo.deleteAnimal(momo.getId());

        mimi.setYearRescue(new Date(2020, 1, 1));
        System.out.println(mimi.getName() + " has been rescued for " + mimi.calcRescuePeriod() + " year(s).");
    }
}