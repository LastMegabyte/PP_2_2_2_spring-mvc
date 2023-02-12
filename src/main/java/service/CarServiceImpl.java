package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    int count;
    List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("1", 1, "green"));
        carList.add(new Car("2", 2, "yellow"));
        carList.add(new Car("3", 3, "blue"));
        carList.add(new Car("4", 4, "white"));
        carList.add(new Car("5", 5, "black"));
    }

    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).toList();
    }
}
