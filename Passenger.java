package flightReservation;

    public class Passenger {
        //attributes of class Passenger
        private static int idCounter = 0;
        private int id;
        //defining class address as private
        private static class Address {
            String street, city, state;
            //Constructor for class address
            Address(String street, String city, String state) {
                this.street = street;
                this.city = city;
                this.state = state;
            }
        }
        private Address address;
        //defining class contact
        private static class Contact {
            String name, phone, email;
         //Constructor for class Contact
            Contact(String name, String phone, String email) {
                this.name = name;
                this.phone = phone;
                this.email = email;
            }
        }
        private Contact contact;
       //Constructor for class passenger
        public Passenger(String street, String city, String state, String name, String phone, String email) {
            this.id = ++idCounter;
            this.address = new Address(street, city, state);
            this.contact = new Contact(name, phone, email);
        }
        //Getter and setters for class passenger attribute
        public int getId() {
            return this.id;
        }

        public String getAddressDetails() {
            return "Street: " + address.street + ", City: " + address.city + ", State: " + address.state;
        }

        public String getContactDetails() {
            return "Name: " + contact.name + ", Phone: " + contact.phone + ", Email: " + contact.email;
        }

        public static int getPassengerCount() {
            return idCounter;
        }
    }


