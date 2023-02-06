package week5;

public class LibraryPatron {
    //A class may or may not have all of the followign
    //Instance variables
    private static int numberOfPatrons = 0;
    private static int nextID = 100;
    private String name;
    private int idNumber;
    private double fines;

    //Constructor(s)
    //three parameters
    public LibraryPatron(String name, int id, double fines) {
        this.name = name;
        idNumber = id;
        this.fines = fines;
        numberOfPatrons += 1;
    }

    //Set the name and the id, but start the fines at 0
    public LibraryPatron(String name, int id) {
        this(name, id, 0);
    }

    //use the auto id
    public LibraryPatron(String name) {
        this(name, nextID++, 0);
    }

    //Class specific methods
    //charge fines
    public void chargeFine(double amount) {
        fines += amount;
    }

    //pay fines
    public void payFines(double amount) {
        fines -= amount;
    }

    public static int returnCount() {
        return numberOfPatrons;
    }


    //equals method
    public boolean equals(Object obj) {
        if (obj instanceof LibraryPatron) {
            LibraryPatron otherPatron = (LibraryPatron)obj;
            return name.equals(otherPatron.name) &&
                    idNumber == otherPatron.idNumber &&
                    fines == otherPatron.fines;
        } else {
            return false;
        }
    }

    //copy method
    public LibraryPatron copy() {
        return new LibraryPatron(name, idNumber, fines);
    }

    //compareTo method - later in the semester

    //hash method - later in the semester

    //toString method
    public String toString() {
        String out = name + " has id number " + idNumber;
        out = out + " and outstanding fines of $"  + fines;
        return out;
    }
}
