package no.hiof.tmwasbra;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Superhero> apex = new ArrayList<>();
        apex.add(new Superhero("Bangalore", "Anita Williams", 35));
        apex.add(new Superhero("Lifeline", "Ajay Che", 24));
        apex.add(new Superhero("Gibraltar", "Makao Gibralter"));
        apex.add(new Superhero("Caustic", "Alexander Nox", 48));
        apex.add(new Superhero("Bloodhound", "Unknown"));
        apex.add(new Superhero("Mirage", "Elliott Witt", 30));
        apex.add(new Superhero("Octane", "Octavio Silva", 24));
        apex.add(new Superhero("Pathfinder", "MRVN"));
        apex.add(new Superhero("Wraith", "Renee Blasey", 32));
        apex.add(new Superhero("Crypto", "Tae Joon Park", 31));
        apex.add(new Superhero("Wattson", "Natalie Paquette", 22));
        apex.add(new Superhero("Revenant", "Unknown", 288));
        apex.add(new Superhero("Loba", "Loba Andrade", 34));
        apex.add(new Superhero("Rampart", "Rayma Parekh", 21));
        apex.add(new Superhero("Horizon", "Dr. Mary Somers", 37));
        apex.add(new Superhero("Fuse", "Walter Fitzroy", 54));

        System.out.println(apex);

        Collections.sort(apex);

        /*Comparator<Superhero> ageSorting = new Comparator<Superhero>() {
            @Override
            public int compare(Superhero superhero1, Superhero superhero2) {
                return superhero1.getAge() - superhero2.getAge();
            }
        };*/

        Comparator<Superhero> ageSorting =
            (superhero1, superhero2) -> superhero1.getAge() - superhero2.getAge();

        Collections.sort(apex, ageSorting);

        System.out.println("\n ********************* ALL ************************");
        printConditionally(apex, aSuperhero -> true);
        System.out.println("\n ******************** Starts with B ***************");
        /*printConditionally(apex, new Condition() {
            @Override
            public boolean test(Superhero aSuperhero) {
                return aSuperhero.getName().startsWith("B");
            }
        });*/
        printConditionally(apex, aSuperhero -> aSuperhero.getName().startsWith("B"));

        System.out.println("***************** Ages 30 and up ******************");
        printConditionally(apex, aSuperhero -> aSuperhero.getAge() >= 30);
    }

    public static void printConditionally(List<Superhero> superheroes, Condition condition) {
        for (Superhero aSuperhero : superheroes){
            if(condition.test(aSuperhero))
                System.out.println(aSuperhero);
        }
    }
}

interface Condition {
    boolean test(Superhero aSuperhero);
}
