package Aufgabe6_1;

import java.util.Date;
/**
 * @author Walter, Annika; Baun, Niklas
 */
public class Director {
    final private String name;
    final private String surname;
    final private Date birthdate;

    /**
     * constructor for director class
     * @param name
     * @param surname
     * @param birthdate
     */
    public Director(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }
    /**
     * getter methods for name, surname and birthdate
     * @return the name, surname or birthdate
     */
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }
}
