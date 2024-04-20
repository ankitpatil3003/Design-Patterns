/**
 * Created on Sep 21, 2005
 *
 * */
package assignment02;

public class ConcreteStudent extends AbstractStudent {
	private String university;

	public ConcreteStudent(Person p) {
		super(p);
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

}
