package courseProject;

public class Customer {
	
	public String custid;
	public String ssn;
	public String lastname;
	public String firstname;
	public String custstreet;
	public String custcity;
	public String custstate;
	public String custzip;
	public String custphone;

	
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
		if (custstreet != null && custstreet.length() > 20) {
			throw new IllegalArgumentException("Street address can not be longer than 20 characters");
		} else if (custstreet ==  null) {
			throw new IllegalArgumentException("Customer street address can not be blank.");
		}
		this.custstreet = custstreet;
	}
	
	public String getCustCity() {
		return custcity;
	}
	
	public void setCustCity(String custcity) {
		if (custcity != null && custcity.length() > 20) {
			throw new IllegalArgumentException("City can not be more than 20 characters");
		} else if (custcity == null) {
			throw new IllegalArgumentException("City can not be left blank");
		}
		this.custcity = custcity;
	}
	
	public String getCustState() {
		return custstate;
	}
	
	public void setCustState(String custstate) {
		if (custstate != null && custstate.length() != 2) {
			throw new IllegalArgumentException("State must be 2 characters");
		} else if (custstate == null) {
			throw new IllegalArgumentException("State can not be blank");
		}
		this.custstate = custstate;
	}
	
	public String getCustZip() {
		return custzip;
	}
	
	public void setCustZip(String custzip) {
		if (custzip != null && custzip.length() == 5 && custzip.chars().allMatch(Character::isDigit)) {
			this.custzip = custzip;
		} else if (custzip == null) {
			throw new IllegalArgumentException("Zip code can not be left blank");
		} else if (custzip != null && custzip.length() != 5 && custzip.chars().allMatch(Character::isDigit)) {
			throw new IllegalArgumentException("Zip code must be 5 digits.");
		} else {
			throw new IllegalArgumentException("Zip code can only be numeric values");
		}
	}
	
	public String getCustPhone() {
		return custphone;
	}
	
	public void setCustPhone(String custphone) {
		try {
			Integer.parseInt(custphone);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Phone number must be a numeric value.");
		}
		if (custphone.length() == 10) {
			this.custphone = custphone;
		}
	}
}

