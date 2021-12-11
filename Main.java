package flightReservation;

public class Main {
    public static void main(String[] args) {
     //object of class regular ticket
    Ticket regularTicket = new RegularTicket("12345", "Bengaluru",
            "Delhi", "DepartureDateTime", "ArrivalDateTime",
            "6F", 5000, false, null, null, "lunch");
//object for class tourist ticket
    Ticket touristTicket = new TouristTicket("67890", "India", "Dubai",
            "DepartureDateTime", "ArrivalDateTIme",
            "10A", 15000, false, null, null,
            "Dubai Hotel", new String[]{""});
 //printing ticket details for both objects
    printTicketDetails(regularTicket);
    printTicketDetails(touristTicket);
}
    //printing flight pnr number as result
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}
