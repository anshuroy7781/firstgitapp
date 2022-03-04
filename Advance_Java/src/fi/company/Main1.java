package fi.company;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    UserValidator validateUserName=str ->{
    	if(str.length()<5)
    		return false;
    	else return true;
    	
    };
    boolean status=validateUserName.validate("cdac122");
    if(status)
    	System.out.println("you have entered a valid username");
    else
    	System.out.println("user Name does not match min criteria");
    
    System.out.println(validateUserName);
    
    UserValidator validatePassword=str ->{
    	if(str.length()<5 || str.length()>16)
    		return false;
    	else
    		return true;
    };
    }
    
	}


