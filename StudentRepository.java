package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class StudentRepository {

	private List<Student> students = new ArrayList<>();
	
	public Student add(Student student) {
		student.setId((long) (students.size()+1));
		students.add(student);
		return student;
	}
	
	public List<Student> findAll() {
		return students;
	}
	
}