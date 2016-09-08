package seedu.addressbook.common;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class UtilsTest {
    
    /**
     * Test isAnyNull()
     */
    
    @Test
    public void isAnyNull_noArgs() {
        assertFalse(Utils.isAnyNull());
    }
    
    @Test
    public void isAnyNull_noNullObject() {
        assertFalse(Utils.isAnyNull("notNull"));
    }
    
    @Test 
    public void isAnyNull_manyNoNullObject() {
        assertFalse(Utils.isAnyNull("notNull", "notNull"));
    }
    
    @Test
    public void isAnyNull_oneNullObject() {
        Object nullObject = null;
        assertTrue(Utils.isAnyNull(nullObject));
    }
    
    @Test
    public void isAnyNull_manyNullObject() {
        Object nullObject = null;
        assertTrue(Utils.isAnyNull(nullObject, nullObject));
    }
    
    @Test
    public void isAnyNull_lastNullObject() {
        Object nullObject = null;
        assertTrue(Utils.isAnyNull("notNull", nullObject));
    }
    
    /**
     * Test elementsAreUnique()
     */
    
    @Test
    public void elementsAreUnique_noElement() {
        Collection<Object> emptyList = new ArrayList();
        assertTrue(Utils.elementsAreUnique(emptyList));
    }
    
    @Test
    public void elementsAreUnique_allUnique() {
        Collection<Object> uniqueList = new ArrayList();
        uniqueList.add("same");
        uniqueList.add("different");
        assertTrue(Utils.elementsAreUnique(uniqueList));
    }
    
    @Test
    public void elementsAreUnique_noUnique() {
        Collection<Object> uniqueList = new ArrayList();
        uniqueList.add("same");
        uniqueList.add("same");
        assertFalse(Utils.elementsAreUnique(uniqueList));
    }

}
