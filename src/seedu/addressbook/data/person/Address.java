package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "a/123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "a/BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    
    private static final int ADDRESS_INDEX_OF_BLOCK = 0;
    private static final int ADDRESS_INDEX_OF_STREET = 1;
    private static final int ADDRESS_INDEX_OF_UNIT = 2;
    private static final int ADDRESS_INDEX_OF_POSTALCODE = 3;

    public final String value;
    private final Block block;
    private final Street street;
    private final Unit unit;
    private final PostalCode postalCode;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        
        this.value = address;
        
        String[] splitAddress = value.split(", ");
        block = new Block(splitAddress[ADDRESS_INDEX_OF_BLOCK]);
        street = new Street(splitAddress[ADDRESS_INDEX_OF_STREET]);
        unit = new Unit(splitAddress[ADDRESS_INDEX_OF_UNIT]);
        postalCode = new PostalCode(splitAddress[ADDRESS_INDEX_OF_POSTALCODE]);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}