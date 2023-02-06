package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
//DAO или Service
@Component
public class CarDAO {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Black", 100));
        carList.add(new Car(2, "White", 150));
        carList.add(new Car(3, "Pink", 200));
        carList.add(new Car(4, "Blue", 230));
        carList.add(new Car(5, "Green", 300));
    }

    public List<Car> showNumberCars(int count) {
        return carList.stream().limit(count).toList();
    }

}
