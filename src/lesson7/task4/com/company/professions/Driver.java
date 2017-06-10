package lesson7.task4.com.company.professions;

public class Driver {
    private String name;
    private int experience;

    public Driver(String name, int experience) {
        this.setName(name);
        this.setExperience(experience);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}