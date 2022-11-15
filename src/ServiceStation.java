import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation //<T extends Transport>
{

    private final String station;
    private final String address;
    //Queue<T> queue = new LinkedList<>();
private final Queue<Transport> transports = new ArrayDeque<>();
    public ServiceStation(String station, String address) {
        this.station = station;
        this.address = address;
    }

    public String getStation() { return station;
    }
    public String getAddress() { return address;
    }
// Methods ______________________________________________________________________________________________

//    public void addTransport(T transport) {
//        queue.offer(transport);
//    }
    public void addTransport(Transport transport) {
       transports.offer(transport);
}
//    public void addCar(Car car) {
//        add(car);
//    }
//    public void addTruck(Truck truck) {
//        add(truck);
//    }
    public void service() {
         if (!transports.isEmpty()) {                  // усли очередь не пуста
            Transport transport = transports.poll();   //  забираем авто из очереди
            boolean result = transport.diagnosed();    //  делаем диагностику
            if (!result) transport.repair();           //  если диагностика true, делаем ремонт
        }
    }
//    public boolean service() {
//        T transport = queue.poll();
//        if (transport != null) {
//            return transport.diagnosed();
//        } else {
//            System.out.println("Очередь на обслуживание пуста.");
//            return false;
//        }
//    }

}
