/*David Caldwell, CS410, Assignment: CiLab */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Assertions.*;



import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }


    @Test
    public void verifyRetrunNullString() {
    	//Verify object init string as null
    	assertNull(myString.getString());
    }
    
    @Test
    public void verifyRetrunSameString() {
    	//Verify setString changes string from null and then getString returns the same string
    	myString.setString("Not Null String");
    	assertEquals("Not Null String",myString.getString());
    }
    
    public void detectAllLowerCase() {
    	//Verify all lower case letter string returns true
    	myString.setString("alllowercasestring");
    	assertTrue(myString.detectCapitalUse());
    }
    
    @Test
    public void detectAllCapitalUseTestAllCapitals() {
    	//Verify all capital case letter string return true
    	myString.setString("ALLCAPITALSTRING");
    	assertTrue(myString.detectCapitalUse());
    }
    
    public void detectFirstCapitalUseTestAllCapitals1() {
    	//Verify all Only first letter is capital case in string return true
    	myString.setString("Onlyfirstlettercapital");
    	assertTrue(myString.detectCapitalUse());
    }
    
    public void detectOneCapitalNotInFirst() {
    	//Verify one capital letter not in first place inside of lower case string returns false
    	myString.setString("oneCapitalletternotfirst");
    	assertFalse(myString.detectCapitalUse());
    }

    public void DetectAllCapitalAndOneLower() {
    	//Verify one lower case fails an all upper case string
    	myString.setString("ONElOWERCASE");
    	assertTrue(myString.detectCapitalUse());
    }

}
