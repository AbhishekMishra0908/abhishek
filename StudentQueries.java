package student;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class StudentQueries implements GraphQLQueryResolver {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentQueries.class);
	
	@Autowired
	StudentRepository repository;
	
	public List<Student> students() {
		LOGGER.info("Students find");
		return repository.findAll();
	}
	

	
}