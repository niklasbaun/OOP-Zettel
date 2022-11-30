package Aufgabe6_1;

import Aufgabe6_1.DVD;

import java.time.LocalDateTime;
import java.util.Date;
public class Library {
    private String name;
    private Date date;
    private DVD[] dvds;

    /**
     * constructor for library class
     * @param name
     * @param dvds
     */
    public Library(String name,  DVD[] dvds) {
        this.name = name;
        this.date = Date.from(LocalDateTime.now().atZone(java.time.ZoneId.systemDefault()).toInstant());
        this.dvds = dvds;
    }

    /**
     * getter methods for library name, date and dvds
     * @return the name, date or dvds
     */
    public String getName() {
        return name;
    }
    public Date getDate() {
        return date;
    }
    public DVD[] getDvds() {
        return dvds;
    }

    /**
     * setter methods for library name, date and dvds
     * @param name, date or dvds
     */
    public void setName(String name) {
        this.name = name;
    }
    public void setDate() {
        this.date = Date.from(LocalDateTime.now().atZone(java.time.ZoneId.systemDefault()).toInstant());
    }

    /**
     * method to add a dvd to the library
     * @param dvd
     */
    public void addDVD(DVD dvd) {
        DVD[] newDvds = new DVD[dvds.length + 1];
        for (int i = 0; i < dvds.length; i++) {
            newDvds[i] = dvds[i];
        }
        newDvds[dvds.length] = dvd;
        this.dvds = newDvds;
        //change the date of the library
        this.setDate();
    }

    /**
     * method to remove a dvd from the library by its title
     * @param title
     */
    public void removeDVD (String title) {
        DVD[] newDvds = new DVD[this.dvds.length - 1];
        int j = 0;
        for (int i = 0; i < this.dvds.length-1; i++) {
            if (this.dvds[i].getTitle().equals(title)) {
                continue;
            }
            newDvds[j] = this.dvds[i];
            j++;
        }
        this.dvds = newDvds;
        //change the date of the library
        this.setDate();
    }

    /**
     * method to find if i own a dvd
     * @param dvd
     * @return true if i own the dvd, false if i don't
     */
    public boolean doIOwn (DVD dvd) {
        for (int i = 0; i < this.dvds.length; i++) {
            if (this.dvds[i].equals(dvd)) {
                return true;
            }
        }
        return false;
    }
}

