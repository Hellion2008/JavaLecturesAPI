package s6;

import java.util.List;

public class Cat {
    private String name;
    private int age;
    private String owner;
    private String poroda;
    private List<String> healthHistory;

    public Cat(){}

    public Cat (String name, int age, String owner, String poroda, List<String> healthHistory) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.poroda = poroda;
        this.healthHistory = healthHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public List<String> getHealthHistory() {
        return healthHistory;
    }

    public void setHealthHistory(List<String> healthHistory) {
        this.healthHistory = healthHistory;
    }

    @Override
    public String toString() {
        return this.getName() + " : " + this.getAge() + " : " + this.getOwner();
    }
}
