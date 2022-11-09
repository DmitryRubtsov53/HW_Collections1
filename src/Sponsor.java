import java.util.ArrayList;

public class Sponsor {
    private String sponsorName;                 // физическое или юридическое лицо.
//    private ArrayList<Transport> spTransports;   // список спонсированного транспорта.
    private int supportAmoun;                  // сумма спонсорской поддержки.

    public Sponsor(String sponsorName, int supportAmoun) {
        this.sponsorName = sponsorName;
        this.supportAmoun = supportAmoun;
    }

    // getters ______________________________________________________________________________________________

    public String getSponsorName() {
        return sponsorName;
    }
//    public ArrayList<Transport> getSpTransports() {
//        return spTransports;
//    }
    public int getSupportAmoun() {
        return supportAmoun;
    }
// setters ______________________________________________________________________________________________

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public void setSupportAmoun(int supportAmoun) {
        this.supportAmoun = supportAmoun;
    }
// Methods ______________________________________________________________________________________________

    public void toSponser (Transport spTransports, int supportAmoun) {
        System.out.println(getSponsorName()+" спонсирует заезд на "+getSupportAmoun()+" руб.");
    }

    @Override
    public String toString() {
        return sponsorName + ", " + supportAmoun +" руб.";
    }
}
