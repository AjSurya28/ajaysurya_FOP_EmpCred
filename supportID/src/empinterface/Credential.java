package empinterface;


import employee.employee;
import service.service;

public interface Credential  {
	
     public String generateEmailAddress(String firstName, String lastName, String department);
     public String generatePassword() ;
     public void showCredentials (employee employee);
 

	}


