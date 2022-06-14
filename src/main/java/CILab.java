/*David Caldwell, CS410, Assignment: CiLab */

public class CILab implements CILabInterface {
    private String myString;
    
    //Constructors
    
    public CILab() {
    	myString = null;
    }

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
    	//Test lower case and upper case strings
    	if (myString.equals(myString.toUpperCase()))
    		return true;
    	if (isLowerCase(myString))
    		return true;
    	// If first letter is capital check the tail for lower case
    	if (myString.charAt(0)> 64 && myString.charAt(0) <  96 )
    		if (isLowerCase(myString.substring(1)))
    			return true;
        return false;
    }
    
    private boolean isLowerCase(String text) {
    	return text.equals(text.toLowerCase());
    }

}

