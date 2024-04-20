/*
 * Created on Sep 21, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package assignment02;

public class InternationalStudentDecorator extends StudentDecorator {
	private String visa;

	public InternationalStudentDecorator(AbstractStudent s, String visa) {
		super(s);
		this.visa = visa;
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}
}
