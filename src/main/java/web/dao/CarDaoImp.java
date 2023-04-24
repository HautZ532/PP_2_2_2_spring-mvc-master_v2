package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp {
    
    public List<Car> getCar(){

        return new ArrayList<>();
    }
}
