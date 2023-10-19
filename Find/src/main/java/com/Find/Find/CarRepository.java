package com.Find.Find;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<CaravanBooking, Long> {
    List<CaravanBooking> findByCityAndState(String city, String state);
}
