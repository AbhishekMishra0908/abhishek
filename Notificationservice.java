package notification;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
@Service
public class Notificationservice  implements NotificationMicroserv{

	@Override
	public void notify(String id, String message) {
	
		
	}
}
	/*@Override
	public void notify(String id, String message) {
	
		
	}

@Autowired
private SimpMessagingTemplate messagingTemplate;
	@Override
	public void notify(String id, String message) {
		messagingTemplate.convertAndSendToUser(
			      id, 
			      "/queue/notify", 
			      message
			    );
			    return;
			  }
		
	

	}


*/