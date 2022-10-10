package kodlamaIODemo.entities;

public class Course {
	private int Id;
	private String CourseName;
	
	public Course() {
		
	}

	public Course(int id, String courseName) {
		
		Id = id;
		CourseName = courseName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	
	
}
