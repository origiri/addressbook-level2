package seedu.addressbook.data.person;

/**
 * Represents a Person's street in the address book.
 */
public class Street {

    private String street_;
    
    public Street(String street) {
        street_ = street;
    }
    
    public String getStreet() {
        return street_;
    }
}
