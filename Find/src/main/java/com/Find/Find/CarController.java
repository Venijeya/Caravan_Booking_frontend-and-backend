package com.Find.Find;

import com.Find.Find.CarRepository;
import com.Find.Find.CaravanBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/bookings")
//public class CarController {
//    private final CarRepository carRepository;
//
//    @Autowired
//    public CarController(CarRepository carRepository) {
//        this.carRepository = carRepository;
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<CaravanBooking> getCarById(@PathVariable Long id) {
//        Optional<CaravanBooking> car = carRepository.findById(id);
//        return car.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//    }
@RestController
@RequestMapping("/bookings")
public class CarController {
    private final CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/{city}/{state}/{checkInDate}/{checkOutDate}/{passengers}")
    public ResponseEntity<List<CaravanBooking>> getBookingsByCityAndState(
            @PathVariable String city,
            @PathVariable String state) {
        List<CaravanBooking> bookings = carRepository.findByCityAndState(city, state);
        if (bookings.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(bookings);
        }
    }
}
