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
    	assertTrue("Not yet implemented");
    }
    
    @Test
    public void verifyRetrunSameString() {
    	//Verify setString changes string from null and then getString returns the same string
    	assertTrue("Not yet implemented");
    }
    
    public void detectAllLowerCase() {
    	//Verify all lower case letter string returns true
    	assertTrue("Not yet implemented");
    }
    
    @Test
    public void detectAllCapitalUseTestAllCapitals() {
    	//Verify all capital case letter string return true
    	assertTrue("Not yet implemented");
    }
    
    public void detectFirstCapitalUseTestAllCapitals1() {
    	//Verify all Only first letter is capital case in string return true
    	assertTrue("Not yet implemented");
    }
    
    public void detectOneCapitalNotInFirst() {
    	//Verify one capital letter not in first place inside of lower case string returns false
    	assertTrue("Not yet implemented");
    }

    public void DetectAllCapitalAndOneLower() {
    	//Verify one lower case fails an all upper case string
    	assertTrue("Not yet implemented");
    }

}
