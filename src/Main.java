import java.util.List;
import SuperMarket.Kassa;
public class Main {
    public static void main(String[] args) {

       System.out.println("Домашнее задание: Введение в коллекции. Списки и очереди. _______________________________ ");
       System.out.println();

        Transport  audi = new Car("Car", "Audi", "A8 50L", 4.1);
        Transport  bmw = new Car("Car", "BMW", "Z05", 3.5);
        Transport  hyundai = new Car("Car", "Hyundai", "i70L", 3.7);
        Transport  kia = new Car("Car", "Kia", "Sport", 4.0);
        Transport  kamaz = new Truck("Truck", "КаМАЗ", "К850", 10.5);
        Transport  maz = new Truck("Truck", "МАЗ", "A650", 10.5);
        Transport  kraz = new Truck("Truck", "КрАЗ", "М1020", 12);
        Transport  gaz = new Truck("Truck", "ГАЗ", "1301", 8.5);
        Transport  nefaz = new Bus("Bus", "НефАЗ", "Н456", 8.5);
        Transport  paz = new Bus("Bus", "ПАЗ", "П587", 9);
        Transport  liaz = new Bus("Bus", "ЛиАЗ", "Л110", 10);
        Transport  gazon = new Bus("Bus", "ГАЗ", "Б1500", 9.5);

// Проверка водительских прав --------------------------------------------------------
        Driver<Car> ivan = new Driver<>("Иван", "B", 10 );
        Driver<Truck> svan = new Driver<>("Сван", "C", 7 );
        Driver<Bus> semen = new Driver<>("Семён", "E", 15 );

//        ivan.checkLicense();
//        svan.checkLicense();
//        semen.checkLicense();

// Работа со списками ---------------------------------------------------------------

        Sponsor bashNeft = new Sponsor("БашНефть",1000000);
        Sponsor ufaNet = new Sponsor("Уфанет",500000);
        Sponsor rusagro = new Sponsor("РусАгро",2000000);
        Mechanic <Car> boris = new Mechanic<>("Борис", "Gold hands");
        Mechanic <Transport> egor = new Mechanic<>("Егор", "Gold hands");
        Mechanic <Bus> oleg = new Mechanic<>("Олег", "Gold hands");

        audi.addDriver(ivan); audi.addMechanic(boris, egor); audi.addSponsor(bashNeft, ufaNet);

        kamaz.addDriver(svan); kamaz.addMechanic(egor); kamaz.addSponsor(rusagro);

        liaz.addDriver(semen); liaz.addMechanic(oleg);liaz.addSponsor(ufaNet);

        List <Transport> transports = List.of ( audi,kia,bmw,hyundai,
                                                kamaz,maz,kraz,gaz,
                                                nefaz,paz,liaz,gazon);

        printInfoMashin(audi);   // инфо о водителе, спонсорах и механниках.
        printInfoMashin(kamaz);
        printInfoMashin(liaz);

        ServiceStation station = new ServiceStation("Новый социализм", "Уфа, ул.Ленина, д.7");
        station.addTransport(kia); station.addTransport(hyundai);
        station.addTransport(maz); station.addTransport(kraz);
        station.addTransport(paz); station.addTransport(gazon);
        station.service();
        station.service();
        station.service();
        station.service();
        station.service();
        station.service();


// Диагностика машин -----------------------------------------------------------------

//        testAuto(audi,bmw,hyundai,kraz,maz,paz,gazon);
//        System.out.println();

// Касса -----------------------------------------------------------------------------
    int a; a = Kassa.sizeQueue();
        System.out.println(a);

    } // main

// methods ________________________________________________________________________________________

    public static void printInfoMashin (Transport transports) {
        System.out.println("Иформация по " + transports.getBrand()+ " " + transports.getModel() + " :" +
                "\n" + "Водитель - " + transports.getDrivers()+ ";");
        System.out.println("Спонсоры заезда :");
        for (Sponsor s : transports.getSponsors()) {
            System.out.println(s);
        }
        System.out.println("Механники :");
        for (Mechanic<?> m : transports.getMechanics()) {
            System.out.println(m);
        }
        System.out.println();
    }
//    public static void testAuto (Transport... automobils) {
//        for (Transport el : automobils) {
//            if (!el.diagnosed()) {
//                try {
//                    throw new RuntimeException(el.getBrand() + " " + el.getModel() + " не прошла диагностику.");
//                } catch (RuntimeException e) {
//                    System.out.println(e.getMessage()); // выводит сообщение из переопределённого метода класса соответствующего "el".
//                } finally {
//                    System.out.println("Остальные машины диагностику прошли и готовы к участию в гонках.");
//                }
//            }
//        }
//    }

} // class -------------------