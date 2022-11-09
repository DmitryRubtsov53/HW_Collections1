public class Driver <C extends Transport & Competing> {
    private String fullName;
    private String license;  // права - лицензии
    private int experience;  // стаж водителя
    private final String CHARS_CHECK = "ABCDE";

    // getters ______________________________________________________________________________________________
    public String getFullName() { return fullName;
    }
    public String getLicense() { return license;
    }
    public int getExperience() { return experience;
    }
// setters ______________________________________________________________________________________________

    public void setLicense(String license) {
        this.license = license;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    // constructor ______________________________________________________________________________________________
    public Driver(String fullName, String license, int experience) {
        this.fullName = fullName;
        this.license = license;
        this.experience = experience;
    }
    // methods __________________________________________________________________________________________________
    public void checkLicense () {

        if (license == null || license.length() != 1 || license.isBlank()) {
            throw new RuntimeException("Водителю " + getFullName() + " необходимо указать тип прав!");
        } else
        if (!CHARS_CHECK.contains(license)) {
            throw new RuntimeException("Водителю " + getFullName() + " необходимо указать тип прав!");
        } else System.out.println("Права водителя " + getFullName() + " в порядке.");
    }

    @Override
    public String toString() {
        return fullName + ", " +
                ", категория " + license + ", стаж " + experience +
                " лет.";
    }
} // class


