package flightReservation;
//creating class Regular Ticket which extends class Ticket
public class RegularTicket extends Ticket {
    private String specialServices;
    //constructor of class Regular ticket and passing attributes of class ticket by using super keyword
    public RegularTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String specialServices) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled,
                flight, passenger);
        this.specialServices = specialServices;
    }
  //getter and setter for regular ticket class attribute
    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
