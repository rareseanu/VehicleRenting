import com.renting.models.Person;
import com.renting.models.Vehicle;
import com.renting.models.VehicleType;
import com.renting.persistence.PersonDao;
import com.renting.persistence.VehicleDao;
import com.renting.services.PersonService;
import com.renting.services.VehicleService;

import java.time.LocalDate;

public class Source {

    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        PersonService personService = new PersonService(personDao);

        personService.addPerson(new Person("5010728087752", "Popescu", "Silviu",
                "Male", LocalDate.of(2001, 7, 28),
                LocalDate.of(2021, 7, 25)));
        personService.addPerson(new Person("1920731086333", "Alexandrescu", "Maria",
                "Female", LocalDate.of(1992, 7, 31),
                LocalDate.of(2015, 5, 12)));

        VehicleDao vehicleDao = new VehicleDao();
        VehicleService vehicleService = new VehicleService(vehicleDao);

        vehicleService.addVehicle(new Vehicle("BV-123-ABC", VehicleType.SEDAN, 2019,
                "Passat", "Black"));
        vehicleService.addVehicle( new Vehicle("BV-12-BCD", VehicleType.SUV, 2018,
                "Peugeot", "Silver"));

        System.out.println("-----VEHICLES-----");
        for(Vehicle vehicle : vehicleService.getAllVehicles()) {
            System.out.println(vehicle);
        }

        System.out.println("-----PERSONS-----");
        for(Person person : personService.getAllPersons()) {
            System.out.println(person);
        }

        System.out.println("-----SORTED BY MANUFACTURING YEAR-----");
        for(Vehicle vehicle : vehicleService.getSortedByManufacturingYear()) {
            System.out.println(vehicle);
        }

        System.out.println("-----GET VEHICLES BY TYPE-----");
        for(Vehicle vehicle : vehicleService.getVehiclesByType(VehicleType.SEDAN)) {
            System.out.println(vehicle);
        }
    }
}
