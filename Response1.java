package notification;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Response")
public class Response1 {

@Id
private int userid  ;
//private int status;
private String message;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public int getuserId() {
	return userid;
}
public void setId(int userid) {
	this.userid = userid;

}
//public void setStatus(int status) {
	//this.status = status;
}
//}


