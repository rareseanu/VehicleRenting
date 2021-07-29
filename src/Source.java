import com.renting.models.Person;
import com.renting.models.Vehicle;
import com.renting.models.VehicleType;
import com.renting.persistence.*;
import com.renting.services.PersonService;
import com.renting.services.VehicleService;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Source {

    public static void main(String[] args) {
        // Homework 4 - IO

        PersonDao personDao = new FilePersonDao("persons.txt");
        PersonService personService = new PersonService(personDao);

        VehicleDao vehicleDao = new FileVehicleDao("vehicles.txt");
        VehicleService vehicleService = new VehicleService(vehicleDao);

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
