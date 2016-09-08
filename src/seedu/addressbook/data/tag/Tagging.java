package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    
    private Person person_;
    private Tag tag_;
    private String TAG_STATUS;
    
    public static final String TAG_ADD = "+";
    public static final String TAG_REMOVE = "-";
    public static final String TAG_FORMAT = "%s %s [%s]";
    
    public Tagging(String tagStatus, Person person, Tag tag) {
        person_ = person;
        tag_ = tag;
        
        if(tagStatus == TAG_ADD) {
            TAG_STATUS = TAG_ADD;
        } else {
            TAG_STATUS = TAG_REMOVE;
        }
    }
    
    @Override
    public String toString() {
        return String.format(TAG_FORMAT, TAG_STATUS, person_.getName(), tag_.tagName);
    }
}