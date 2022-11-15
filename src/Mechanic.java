import java.util.ArrayList;

public class Mechanic <T extends Transport> {
    private String mechanicName;
    private String company;
//    private ArrayList<Transport> canWorkWith;

    public Mechanic(String mechanicName, String company) {
        this.mechanicName = mechanicName;
        this.company = company;

    }
// getters ______________________________________________________________________________________________

    public String getMechanicName() { return mechanicName;
    }
    public String getCompany() { return company;
    }

// setters ______________________________________________________________________________________________
    public void setMechanicName(String mechanicName) {             // сделать проверки !!!
        this.mechanicName = mechanicName;
    }
    public void setCompany(String company) {
        this.company = company;
    }

// methods ______________________________________________________________________________________________
    public boolean servingTransport (T transport) {
          return transport.diagnosed();
    }
    public void repairTransport (T transport) {
        transport.repair();
    }

    @Override
    public String toString() {
        return mechanicName + ", " + company + " .";
    }
}
