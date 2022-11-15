import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private String typeAuto;
    private List<Driver<?>> drivers = new ArrayList<>();      // Бизин ***
    private List<Mechanic<?>> mechanics = new ArrayList<>();  // Бизин ***
    private List<Sponsor> sponsors = new ArrayList<>();  // Бизин ***


// getters ______________________________________________________________________________________________

    public String getBrand() { return brand;
    }
    public String getModel() { return model;
    }
    public double getEngineVolume() { return engineVolume;
    }
    public String getTypeAuto() { return typeAuto;
    }
    public List<Driver<?>> getDrivers() { return drivers;
    }
    public List<Mechanic<?>> getMechanics() { return mechanics;
    }
    public List<Sponsor> getSponsors() { return sponsors;
    }

    // setters ______________________________________________________________________________________________

    public void setBrand(String brand) {
        this.brand = (brand != null && !brand.isBlank() && !brand.isEmpty()) ? brand : "default";
    }
    public void setModel(String model) {
        this.model = (model != null && !model.isBlank() && !model.isEmpty())? model : "default";
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume != 0 ? engineVolume : 10;
    }

    public void setTypeAuto(String typeAuto) {
        this.typeAuto = (typeAuto!= null && !typeAuto.isBlank() && !typeAuto.isEmpty())? typeAuto : "default";
    }
    // constructor ______________________________________________________________________________________________

    public Transport (String typeAuto, String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setTypeAuto(typeAuto);

    }

// Methods ______________________________________________________________________________________________
    @Override
    public String toString() {
        return  this.typeAuto + ": " + this.brand + ", модель - " + this.model
                + ", V двигателя - " + this.engineVolume + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport automobil = (Transport) o;
        return Double.compare(automobil.engineVolume, engineVolume) == 0
                && Objects.equals(brand, automobil.brand)
                && Objects.equals(model, automobil.model)
                && Objects.equals(typeAuto, automobil.typeAuto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, typeAuto);
    }
    public abstract void startMoving ();
    public abstract void finishMove ();
    public abstract boolean diagnosed ();
    public abstract void repair();

//    public void addDriver (Driver <?> driver) {        // Бизин ***
//        drivers.add(driver);
//    }
    public void addDriver (Driver<?>... driver) {        // Бизин NEW - версия для нескольких водителей у одного авто.
        this.drivers.addAll(Arrays.asList(driver));
    }
//    public void addMechanic (Mechanic <?> mechanic) {  // Бизин ***
//        mechanics.add(mechanic);
//    }
    public void addMechanic (Mechanic<?>... mechanic) {  // Бизин NEW - версия для нескольких механников у одного авто.
        this.mechanics.addAll(Arrays.asList(mechanic));
    }
//    public void addSponsor (Sponsor sponsor) {          // Бизин ***
//        sponsors.add(sponsor);
//    }
    public void addSponsor (Sponsor... sponsor) {          // Бизин NEW - версия для нескольких спонсоров у одного авто.
        this.sponsors.addAll(Arrays.asList(sponsor));
    }

} // class ______________________________________________________________________________________________

