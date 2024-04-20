/*
 * Created on Jan 26, 2005
 *
 */
package assignment02;

public class Person {
	private String name;
	private String streetAddress;
	private String city;
	private String stateAndZip;
	private String country;
	private String dateOfBirth;

	public Person(String name, String date, String string, String string2, String string3, String string4) {
		this.name = name;
		dateOfBirth = date;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStateAndZip() {
		return stateAndZip;
	}

	public void setStateAndZip(String stateAndZip) {
		this.stateAndZip = stateAndZip;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}
}
