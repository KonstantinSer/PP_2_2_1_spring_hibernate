package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> cars = List.of(
            new Car("BMW","5", "gold"),
            new Car("KIA","k5", "white"),
            new Car("HONDA","Civic", "blue"),
            new Car("LADA","Granta", "yellow"),
            new Car("Peugeot","406", "red")
    );

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count > cars.size()) {
            return cars;
        }

        return cars.subList(0, count);
    }
}
