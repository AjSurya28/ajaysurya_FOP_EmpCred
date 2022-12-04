package service;
import java.util. Random;
import empinterface.Credential;
import employee.employee;

public class service implements Credential {
	
	public String generatePassword() {
    String capitalletters = "ABCDEFGHIJKLMNOPORSTUVWXYZ";
	String smallLetters = "abodefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters ="!@#$%&*_=+-/.?<>0)";
	
	String values = capitalletters + smallLetters + specialCharacters+ numbers;
	Random random = new Random ();
	
	String password="";
	for (int i = 0; i < 8; i++) {
	
	password += String.valueOf(values.charAt (random.nextInt (values. length())));
	
    }
	return password;
	
}
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
	return firstName+lastName+"@"+department+".ql.in";
	}
	public void showCredentials (employee employee) {
			System.out.println("Dear "+employee.getFirstName ()+ " your generated credentials are created");
			System.out.println("Email\t\t"+employee.getEmail ());
			System.out.println("Password\t"+employee.getPassword());
	}
}
