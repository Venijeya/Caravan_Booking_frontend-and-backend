package com.Find.Find;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "caravan_bookings")
public class CaravanBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String state;
    private String city;
    private String phoneNumber;
    private Date checkInDate;
    private Date checkOutDate;
    private String caravanType;
    private int passengers;
    private String specialRequests;
    private String paymentMethod;
    private String expirationDate;

    // Getters and setters
    // ...


    public CaravanBooking(Long id, String state, String city, String phoneNumber, Date checkInDate, Date checkOutDate, String caravanType, int passengers, String specialRequests, String paymentMethod, String expirationDate) {
        this.id = id;
        this.state = state;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.caravanType = caravanType;
        this.passengers = passengers;
        this.specialRequests = specialRequests;
        this.paymentMethod = paymentMethod;
        this.expirationDate = expirationDate;
    }

    public CaravanBooking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getCaravanType() {
        return caravanType;
    }

    public void setCaravanType(String caravanType) {
        this.caravanType = caravanType;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
