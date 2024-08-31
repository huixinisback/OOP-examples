
import java.util.Arrays;
import java.util.Comparator;

public class SortingArrayOfObjects {
    public static void main(String[] args) {
        Car[] cars = {
                new Car ("SGX1234","Toyota",4.3),
                new Car ("SNG8888","Honda",1.9)
        };

        //before sort
        for (int i=0; i<cars.length; i++){
            System.out.print(cars[i].brand + " ");
        }
        System.out.println();

        Arrays.sort (cars, new SortByBrand());
        //after sort
        for (int i=0; i<cars.length; i++){
            System.out.print(cars[i].brand + " ");
        }
    }


}

class SortByBrand implements Comparator<Car> {
    @Override
    public int compare(Car a, Car b) {
        return(int)(a.brand.compareTo(b.brand));
    }
}

class Car {
    String license;
    String brand;
    double age;
    public Car(String license, String brand, double age) {
        this.license = license;
        this.brand = brand;
        this.age = age;
    }
}