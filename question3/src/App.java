import com.san.Bike.Bike;
import com.san.Vehicle.Vehicle;
import com.san.carModels.Sedan.Sedan;

public class App {
    public static void main(String[] args) throws Exception {
        Sedan car = new Sedan(
            "Corolla",
            "Toyota",
            "Black",
            2017,
            250.7f,
            73.2f
        );

        Bike bike = new Bike(
            "Twister",
            "Honda",
            "Red",
            2020,
            61.9f
        );

        for (Vehicle vehicle : new Vehicle[] { car, bike }) {
            System.out.println(vehicle.getName());
            System.out.println(vehicle.getBrand());
            System.out.println(vehicle.getColor());
            System.out.println(vehicle.getYear());
            System.out.println(vehicle.getMileage());
            System.out.println();
        }
    }
}
