package notification;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
	@Autowired
	Notificationservice notiserv;
	@Autowired
    UserserviceDelegate userservicedel;
	@RequestMapping(value="/Notify/{userid}")
public Response Notifyuser(@PathVariable ("userid") int userid,@RequestParam ("message") String message ) {
	Response response= new Response();
	try {
		UserInformation userinfo = userservicedel.getUserDetails(userid);
		notiserv.notify(userinfo.getEmail(), message);
		Response1 res = new Response1();
	res.setMessage("Message Sent");
		response.setStatus(HttpStatus.OK.value());
	}
	catch(Exception e) {
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		
	}
	
	
	return response;
		
	}
}
