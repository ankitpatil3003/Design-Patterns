package assignment02;

import java.util.List;

public class CourseDecorator extends StudentDecorator {
	String courseRubric; // such as "CS", "MATH", "CHEM", "ISE"
	String courseNumber; // such as "350", "520", "480A", "580T"
	String courseTitle; // such as "Design Patterns"
	int credits; // such as 3, 4
	String section; // such as "01", "90", "A52"
	String grade; // such as "IP", "A", "C+"

	public CourseDecorator(AbstractStudent s, String courseRubricIn,
			String courseNumberIn, String courseTitleIn, int creditsIn,
			String sectionIn, String gradeIn) {
		super(s);
		courseRubric = courseRubricIn;
		courseNumber = courseNumberIn;
		courseTitle = courseTitleIn;
		credits = creditsIn;
		section = sectionIn;
		grade = gradeIn;
	}

	public String getCourses() {
		// MODIFY this code so it returns a list of all the courses from all the
		// CourseDecorators attached to the test object.
		// return this.toString() + "\n";
		List<String> courses = delegate.getCourseList();
		courses.add(this.toString());
		return String.join("\n", courses);
	}

	public List<String> getCourseList() {
		// MODIFY this code to add "this.toString()" to the List
		// DO NOT make a List here, rely on the delegate to do that
		// return null; // remove this line, it is only here to make the code compile
		List<String> courses = delegate.getCourseList();
		courses.add(this.toString());
		return courses;
	}

	public void setGrade(String courseRubricIn, String courseNumberIn, String sectionIn, String gradeIn) {
		// if courseRubricIn.equals(courseRubric) and
		// courseNumberIn.equals(courseNumber) and
		// sectionIn.equals(section) then change grade to gradeIn
		// otherwise pass the method to the delegate
		if (courseRubricIn.equals(courseRubric) && courseNumberIn.equals(courseNumber) && sectionIn.equals(section)) {
			this.grade = gradeIn;
		} else {
			delegate.setGrade(courseRubricIn, courseNumberIn, sectionIn, gradeIn);
		}
	}

	@Override
	public String toString() {
		return courseRubric + " " + courseNumber + "-" + section + ": "
				+ courseTitle + "(" + credits + "cr), grade=" + grade;
	}

}
