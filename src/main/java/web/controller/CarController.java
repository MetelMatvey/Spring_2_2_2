package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;

@Controller
public class CarController {

    private final CarDAO carDAO;
    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping("/cars")
    public String showNumberCars(@RequestParam(value = "count", defaultValue = "1000")
                                     int count, Model model){
        model.addAttribute("cars", carDAO.showNumberCars(count));
       return "cars";
    }

}
