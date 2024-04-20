package assignment02;

import java.util.List;

import assignment02.GraduateDecorator.Program;

public abstract class StudentDecorator extends AbstractStudent {
	protected AbstractStudent delegate;

	public StudentDecorator(AbstractStudent s) {
		super(s.getInnerSelf());
		delegate = s;
	}

	public Person getInnerSelf() {
		return delegate.getInnerSelf();
	}

	// ALL OTHER METHODS INHERITED FROM AbstractStudent SHOULD
	// ALSO PASS THE CALL TO THE delegate AS IS DONE IN THE getters
	// and setters LIST HERE ALREADY
	// FOR EXAMPLE
	public String getCourses() {
		return delegate.getCourses();
	}

	@Override
	public List<String> getCourseList() {
		return delegate.getCourseList();
	}

	public UndergraduateDecorator.Level getLevel() {
		return delegate.getLevel();
	}

	public String getMajor() {
		return delegate.getMajor();
	}

	public String getUniversity() {
		return delegate.getUniversity();
	}

	public int hashCode() {
		return delegate.hashCode();
	}

	public void setMajor(String major) {
		delegate.setMajor(major);
	}

	public void setUniversity(String university) {
		delegate.setUniversity(university);
	}

	// Add setter methods here for level, countyOfResidence, program, visa, and
	// grade
	@Override
	public void setLevel(UndergraduateDecorator.Level level) {
		delegate.setLevel(level);
	}

	@Override
	public void setCountyOfResidence(String countyOfResidence) {
		delegate.setCountyOfResidence(countyOfResidence);
	}

	@Override

	public String getcountyOfResidence() {
		// System.out.println("Method not implemented");
		return delegate.getcountyOfResidence();
	}

	@Override
	public void setProgram(GraduateDecorator.Program program) {
		delegate.setProgram(program);
	}

	@Override
	public Program getProgram() {
		// System.out.println("Method not implemented");
		return delegate.getProgram();
	}

	@Override
	public void setVisa(String visa) {
		delegate.setVisa(visa);
	}

	@Override
	public String getVisa() {
		// System.out.println("Method not implemented");
		return delegate.getVisa();
	}

	@Override
	public void setGrade(String courseRubricIn, String courseNumberIn, String sectionIn, String gradeIn) {
		delegate.setGrade(courseRubricIn, courseNumberIn, sectionIn, gradeIn);
	}
}
