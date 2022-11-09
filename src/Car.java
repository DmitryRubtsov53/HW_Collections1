public class Car extends Transport implements Competing {

    public static final double[] MAX_SPEED_CAR = {250, 240, 215, 235};

    public Car(String typeAuto, String brand, String model, double engineVolume) {
        super(typeAuto, brand, model, engineVolume);
    }

    @Override
    public void startMoving () {
        System.out.println("Start of car: Снимаем с ручного тормоза, заводим автомобиль, прогреваем," +
                " выжимаем сцепление, включаем 1-ю передачу, нажимаем на педаль газа, отпускаем сцепление.");
    }
    @Override
    public void finishMove () {
        System.out.println("Finish of car: Съезжаем с трассы, отпускаем педаль газа, переключаемся на нейтралку," +
                " жмём на тормоз, выключаем двигатель, ставим на ручной тормоз.");
    }

    @Override
    public boolean diagnosed() {
        return Math.random() > 0.5;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand()+" "+getModel()+" починена.");
    }

    // methods interfase ______________________________________________________________________________________________

    @Override
    public void pitStop() {
        System.out.println("Пора сменить колёса! Заезжай на Pit Stop.");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время " + (ROUTE_LENGTH / MAX_SPEED_CAR[0]) + " мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + MAX_SPEED_CAR[2] + " км/ч.");
    }

} // class ______________________________________________________________________________________________
