public class Truck extends Transport implements Competing {

    public static final double[] MAX_SPEED_CAR = {150, 140, 180, 175};
    public Truck(String typeAuto, String brand, String model, double engineVolume) {
        super(typeAuto, brand, model, engineVolume);
    }
    @Override
    public void startMoving () {
        System.out.println("Start of truck:Снимаем с ручного тормоза, заводим грузовик, прогреваем," +
                " выжимаем сцепление, включаем 1-ю передачу, нажимаем на педаль газа, отпускаем сцепление.");
    };
    @Override
    public void finishMove () {
        System.out.println("Finish of truck: Съезжаем с трассы, отпускаем педаль газа, переключаемся на нейтралку," +
                " жмём на тормоз, выключаем двигатель грузовика, ставим на ручной тормоз.");
    }

    @Override
    public boolean diagnosed() {
        return Math.random() > 0.75;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand()+" "+getModel()+" починена.");
    }

    // methods interfase ________________________________________________________________________________________
    @Override
    public void pitStop() {
        System.out.println("Пора сменить колёса! Заезжай на Pit Stop.");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время " + (ROUTE_LENGTH / MAX_SPEED_CAR[1]) + " мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + MAX_SPEED_CAR[0] + " км/ч.");
    }
}
