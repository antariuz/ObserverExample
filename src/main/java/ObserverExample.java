import model.Observed;
import model.Observer;
import model.impl.ScooterShop;
import model.impl.Subscriber;

public class ObserverExample {

    public static void main(String[] args) {
        ScooterShop scooter = new ScooterShop();
        scooter.setPrice(100);

        Observer subscriber1 = new Subscriber("John Wick");
        Observer subscriber2 = new Subscriber("Vinny Pooh");

        scooter.addObserver(subscriber1);
        scooter.addObserver(subscriber2);

        scooter.changePrice(49.99);

    }

}
