package flightReservation;

public class Flight {
    //Defining attributes for class flight//
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;
 //flight constructor//
    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }
    //setting getter and setters for class attributes//
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
  //defining function to get details of flight
    public String getFlightDetails() {
        return "Flight No: " + flightNumber + ", Airline: " + airline +
                ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }
//function to check whether the  seats in flight available or not
    public boolean checkAvailability() {
        return bookedSeats < capacity;
    }
//increasing ticket after 1 ticket booked
    public void incrementBookingCounter() {
        bookedSeats++;
    }
}
