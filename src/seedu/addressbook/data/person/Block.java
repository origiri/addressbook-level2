package seedu.addressbook.data.person;

/**
 * Represents a Person's block in the address book.
 */
public class Block {

    private String block_;
    
    public Block(String block) {
        block_ = block;
    }
    
    public String getBlock() {
        return block_;
    }
}
