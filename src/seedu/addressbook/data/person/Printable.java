package seedu.addressbook.data.person;

public interface Printable {
    
    int PRINTABLE_STRING_START = 0;
    int PRINTABLE_STRING_EXCESS = 2;

    public String getPrintableString();
    
    /**
     * Returns a concatenated version of the printable strings of each object.
     */
    default String getPrintableString(Printable... printables) {
        StringBuilder printableString = new StringBuilder();
        for(Printable printable: printables) {
            printableString.append(printable.getPrintableString() + ", ");
        }
        return printableString.substring(PRINTABLE_STRING_START, printableString.length() - PRINTABLE_STRING_EXCESS);
    }
}
