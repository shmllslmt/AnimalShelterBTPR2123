import java.util.ArrayList;

public class Cat extends Animal {
    private boolean hasVaccinated;
    private ArrayList<String> activities;

    protected Cat() {
        this(false);
    }
    protected Cat(boolean hasVaccinated) {
        super("A000", "Animal", new Shelter());
        this.hasVaccinated = hasVaccinated;
        this.activities = new ArrayList<>();
    }
    protected Cat(String id, String name, Shelter shelter, boolean hasVaccinated) {
        super(id, name, shelter);
        this.hasVaccinated = hasVaccinated;
        this.activities = new ArrayList<>();
    }

    public ArrayList<String> getActivities() {
        return activities;
    }

    public void addActivities(ArrayList<String> activities) {
        this.activities = activities;
    }
    public void addActivity(String activity) {
        activities.add(activity);
    }
    public void removeActivity(String activity) {
        activities.remove(activity);
    }
}
