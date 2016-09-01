package seedu.addressbook.data.person;

/**
 * Represents a Person's postal code in the address book.
 */
public class PostalCode {

    private int postalCode_;
    
    public PostalCode(int postalCode) {
        postalCode_ = postalCode;
    }
    
    public int getPostalCode() {
        return postalCode_;
    }
}
