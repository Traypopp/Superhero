package no.hiof.tmwasbra;

public class Superhero implements Comparable<Superhero> {
    private String name, realName;
    private int age;

    public Superhero(String name, String realName) {
        this.name = name;
        this.realName = realName;
        this.age = 0;
    }

    public Superhero(String name, String realName, int age) {
        this.name = name;
        this.realName = realName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + realName + " - " + (age == 0 ? "Unkown" : age);
    }

    @Override
    public int compareTo(Superhero otherSuperhero) {
        return this.getName().compareTo(otherSuperhero.getName());
    }
}
