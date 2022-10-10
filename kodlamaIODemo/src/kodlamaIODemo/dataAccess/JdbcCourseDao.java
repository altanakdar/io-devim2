package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc Veri tabanına eklendi");
		
	}

}
