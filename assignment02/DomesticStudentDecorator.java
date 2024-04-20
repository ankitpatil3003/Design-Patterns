/*
 * Created on Sep 21, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package assignment02;

public class DomesticStudentDecorator extends StudentDecorator {
	private String countyOfResidence;

	public DomesticStudentDecorator(AbstractStudent s, String countyOfResidence) {
		super(s);
		this.countyOfResidence = countyOfResidence;
	}

	public String getCountyOfResidence() {
		return countyOfResidence;
	}

	public void setCountyOfResidence(String countyOfResidence) {
		this.countyOfResidence = countyOfResidence;
	}

}
