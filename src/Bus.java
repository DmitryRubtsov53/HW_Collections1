public class Bus extends Transport implements Competing {

    public static final double[] MAX_SPEED_CAR = {120, 140, 130, 135};
    public Bus(String typeAuto, String brand, String model, double engineVolume) {
        super(typeAuto, brand, model, engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("Start of bus: Снимаем с ручного тормоза, заводим автобус, прогреваем, выжимаем сцепление," +
                " включаем 1-ю передачу, нажимаем на педаль газа, отпускаем сцепление.");
    }
    @Override
    public void finishMove() {
        System.out.println("Finish of bus: Съезжаем с трассы, отпускаем педаль газа, переключаемся на нейтралку," +
                " жмём на тормоз, выключаем двигатель автобуса, ставим на ручной тормоз.");
    }

    @Override
    public boolean diagnosed() {
        System.out.println(getBrand() + " " + getModel() + " диагностика не требуется.");
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand()+" "+getModel()+" починена.");
    }

    // methods interfase _________________________________________________________________________________
    @Override
    public void pitStop() {
        System.out.println("Пора сменить колёса! Заезжай на Pit Stop.");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время " + (ROUTE_LENGTH / MAX_SPEED_CAR[3]) + " мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + MAX_SPEED_CAR[0] + " км/ч.");
    }
} // class ______________________________________________________________________________________________

