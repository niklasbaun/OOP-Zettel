package Aufgabe6_1;

import java.util.Date;

public class Actor {
    final private String name;
    final private String surname;
    final private Date birthdate;
    /**
     * constructor for actor class
     * @param name
     * @param surname
     * @param birthdate
     */
    public Actor(String name, String surname, Date birthdate) {
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
