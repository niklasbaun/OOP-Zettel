package Aufgabe6_1;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Walter, Annika; Baun, Niklas; Mahlberg, Kilian
 */
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
    public DVD[] getDVDs() {
        return dvds;
    }

    /**
     * setter method for library date
     */
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
     *countDVDs count the number of DVDs with the given title in the collection.
     *@param title is the title we are looking for.
     *@return the number of copies in the collection.
     */
    private int countDVDs(final String title){
        int count = 0;
        for(int i = 0; i < dvds.length; i++) {
            if(dvds[i].getTitle() == title) {
                count++;
            }
        }
        return count;
    }

    /**
     *removeDVD removes all DVDs with the given title from the collection. It also changes the date to current date.
     *@param title is the title we are looking for.
     */
    public void removeDVD(final String title) {
        final int count = countDVDs(title);
        DVD[] newDVDs = new DVD[dvds.length - count];
        int newCollIndex = 0;
        for(int i = 0; i < dvds.length; i++) {
            if(dvds[i].getTitle() != title) {
                newDVDs[newCollIndex] = dvds[i];
                newCollIndex++;
            }
        }
        this.dvds = newDVDs;
        date = new Date();
    }

    /**
     *doIOwn checks if the given DVD is in our collection.
     *@param dvd is the DVD we are looking for.
     *@return true if we own the DVD. Otherwise false
     */
    public boolean doIOwn(DVD dvd) {
        return countDVDs(dvd.getTitle()) > 0;
    }
}

