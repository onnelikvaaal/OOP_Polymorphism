import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    Queue<Transport> serviceStationQueue = new LinkedList<>();

    public void addToServiceQueue(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не проходят техобслуживание");
            return;
        }
        serviceStationQueue.offer(transport);
    }

    public void service() {
        Transport transport = serviceStationQueue.poll();
        if (transport == null) {
            System.out.println("Нет автомобилей в очереди на ТО");
            return;
        }
        try {
            transport.getDiagnostics();
        } catch (TransportTypeException e) {

        }

    }
}
