package Aufgabe6_1;

import java.util.Date;

public class Aufgabe6_1 {
    public static void main(String[] args) {
        // create a new library with content
        // create actors
        Actor actor1 = new Actor("Viggo", "Mortensen", new Date(1958, 10, 20));
        Actor actor2 = new Actor("Hugo", "Weaving", new Date(1960, 4, 4));
        Actor actor3 = new Actor("Orlando", "Bloom", new Date(1977, 1, 13));
        Actor actor4 = new Actor("Elijah", "Wood", new Date(1981, 1, 28));
        Actor actor5 = new Actor("Ian", "McKellen", new Date(1939, 5, 25));
        Actor actor6 = new Actor("Sean", "Bean", new Date(1959, 4, 17));
        Actor actor7 = new Actor("Christopher", "Lee", new Date(1922, 5, 27));
        Actor actor8 = new Actor("Matt", "Damon", new Date(1970, 8, 8));
        Actor actor9 = new Actor("Franka", "Potente", new Date(1974, 12, 22));
        Actor actor10 = new Actor("Clive", "Owen", new Date(1964, 10, 3));
        Actor actor11 = new Actor("Karl", "Urban", new Date(1972, 6, 7));
        Actor actor12 = new Actor("Daniel", "Brühl", new Date(1978, 6, 16));
        Actor actor13 = new Actor("Tommy", "Lee Jones", new Date(1946, 9, 15));
        // create directors
        Director director1 = new Director("Peter", "Jackson", new Date(1961, 10, 31));
        Director director2 = new Director("Paul", "Greengrass", new Date(1961, 10, 29));
        Director director3 = new Director("Doug", "Liman", new Date(1965, 7, 22));
        Director director4 = new Director("Tony", "Gilroy", new Date(1958, 10, 20));

        // create DVDs
        DVD dvd1 = new DVD("Lord of the Rings: The Fellowship of the Ring", "0000-0000-401A-0000-7-0000-000A-V", director1, new Actor[]{actor1, actor2, actor3, actor4, actor5, actor6, actor7});
        DVD dvd2 = new DVD("Lord of the Rings: The Two Towers", "0000-0001-DAA4-0000-O-0000-0008-L",director1, new Actor[]{actor1, actor2, actor3, actor4, actor5, actor6, actor7, actor11});
        DVD dvd3 = new DVD("Lord of the Rings: The Return of the King", "0000-0001-DAA3-0000-J-0000-0009-0",  director1, new Actor[]{actor1, actor2, actor3, actor4, actor5, actor6, actor7, actor11});
        DVD dvd4 = new DVD("The Bourne Identity", "0000-0000-F733-0000-5-0000-0000-M", director2, new Actor[]{actor8, actor9, actor10});
        DVD dvd5 = new DVD("The Bourne Supremacy", "0000-0001-5EB1-0000-S-0000-0009-9", director2, new Actor[]{actor8, actor9, actor11});
        DVD dvd6 = new DVD("The Bourne Ultimatum", "0000-0001-BDCB-0000-M-0000-0006-V", director2, new Actor[]{actor8, actor12});
        DVD dvd8 = new DVD("Jason Bourne", "0000-0004-755D-0000-Z-0000-0000-6", director4, new Actor[]{actor8, actor13});

        //create library
        DVD[] dvds = new DVD[0];
        Library library = new Library("My Library", dvds);
        //add all DVDs to the library
        library.addDVD(dvd1);
        library.addDVD(dvd2);
        library.addDVD(dvd3);
        library.addDVD(dvd4);
        library.addDVD(dvd5);
        library.addDVD(dvd6);
        library.addDVD(dvd8);

        //remove some DVDs from the library
        library.removeDVD("The Bourne Ultimatum");
        library.removeDVD("The Two Towers");

        System.out.println(library.doIOwn(dvd3));
        System.out.println(library.doIOwn(dvd6));


    }
}
