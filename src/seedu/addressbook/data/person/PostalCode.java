package seedu.addressbook.data.person;

/**
 * Represents a Person's postal code in the address book.
 */
public class PostalCode {

    private String postalCode_;
    
    public PostalCode(String postalCode) {
        postalCode_ = postalCode;
    }
    
    public String getPostalCode() {
        return postalCode_;
    }
}
