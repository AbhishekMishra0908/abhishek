package notification;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserserviceDelegate {
	// @HystrixCommand(fallbackMethod= "callUserServiceAndGetData_Fallback")
public UserInformation getUserDetails(int id) {
	ResponseEntity<UserInformation> responseEntity = new RestTemplate().getForEntity(
			"http://localhost:8056/usermanagement/user/" +id,UserInformation.class
			);
	
	UserInformation response = responseEntity.getBody();
	
	return response;
	/*@SuppressWarnings("unused")
	//private UserInformation callUserServiceAndGetData_Fallback(int id) {
		System.out.println("user service is down");
	return null;
	*/
	}
}


/*package notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class UserserviceDelegate {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/sendnotification")
	public ResponseEntity<UserInformation> getUserDetails(int id) {
		ResponseEntity<UserInformation> responseEntity = restTemplate.getForEntity(
				"http://localhost:8056/usermanagement/user/" +id,UserInformation.class
				);
	
		return responseEntity;
	 
	
	
}}*/

