package cvo.crescendo.project.*;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RootController {
	//TEMP, change to get student and get email address
	public Student student;


	@Autowired
	private SmtpMailSender smtpMailSender;

	// change list to array
	String [] emailarray = student.getEmail().toArray(new String[student.getEmail().size()]);


	@RequestMapping("/send-mail")

	public void sendMail() throws MessagingException {
		//TESTMAIL
		smtpMailSender.send(emailarray, "Test mail " + student.getFirstName(), "Mail Ontvangen!\n" + student.getFirstName() + " " + student.getLastName());
		
	}
	

}
