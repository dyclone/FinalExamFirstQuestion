package QuestionA;

import java.util.Date;

public interface iPersonReadWrite {

	public static void setFirstName(String FirstName) {
		FirstName = FirstName;
	}
	
	public static void setMiddleName(String MiddleName) {
		MiddleName = MiddleName;
	}
	
	public static void setLastName(String LastName) {
		LastName = LastName;
	}
	
	public static void setDOB(Date DOB) {
		DOB = DOB;
	}

	public static void setAddress(String newAddress) {
		address = newAddress;
	}
	
	public static void setPhone(String newPhone_number) {
		phone_number = newPhone_number;
	}
	
	public static void setEmail(String newEmail) {
		email_address = newEmail;
	}
}
