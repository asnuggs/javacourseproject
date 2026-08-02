package courseProject;

public class Customer {
	
	private String custid;
	private String ssn;
	private String lastname;
	private String firstname;
	private String custstreet;
	private String custcity;
	private String custstate;
	private String custzip;
	private String custphone;

	
	public String getID() {
		return custid;
	}
	
	public void setID(String custid) {
		if (custid != null && custid.length() > 5) {
			throw new IllegalArgumentException("Customer ID can not be longer than 5 characters");
		} else if (custid == null) {
			throw new IllegalArgumentException("Customer ID can not be blank.");
		}
		this.custid = custid;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public void setSSN(String ssn) {
		if (ssn != null && ssn.chars().allMatch(Character::isDigit) && ssn.length() == 9) {
			this.ssn = ssn;
		} else if (ssn == null) {
			throw new IllegalArgumentException("SSN can not be blank.");
		} else if (ssn != null && ssn.chars().allMatch(Character::isDigit) && ssn.length() != 9) {
			throw new IllegalArgumentException("SSN must be 9 characters");
		} else {
			throw new IllegalArgumentException("SSN can only have numeric values");
		}
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void setLastName(String lastname) {
		if (lastname != null && lastname.length() > 20) {
			throw new IllegalArgumentException("Last name can not be more that 20 characters");
		} else if (lastname == null) {
			throw new IllegalArgumentException("Last name can not be blank");
		}
		this.lastname = lastname;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setFirstName(String firstname) {
		if (firstname != null && firstname.length() >15) {
			throw new IllegalArgumentException("First name can not be more that 15 characters.");
		} else if (firstname == null) {
			throw new IllegalArgumentException("First name can not be blank.");
		}
		this.firstname = firstname;
	}
	
	public String getCustStreet() {
		return custstreet;
	}
	
	public void setCustStreet(String custstreet) {
		;
	}
	
	public String getCustCity() {
		return custcity;
	}
	
	public void setCustCity(String custcity) {
		;
	}
	
	public String getCustState() {
		return custstate;
	}
	
	public void setCustState(String custstate) {
		;
	}
	
	public String getCustZip() {
		return custzip;
	}
	
	public void setCustZip(String custzip) {
		;
	}
	
	public String getCustPhone() {
		return custphone;
	}
	
	public void setCustPhone() {
		;
	}
}

