package cvo.crescendo.project.emails;

import cvo.crescendo.project.models.Student;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@RestController
public class RootController {
	//TEMP, change to get student and get email address
	public Student student;

	//private Date d = new Date("1985-07-31T00:00:00");

	List<String> email = Arrays.asList("s090045@ap.be");

	Student Alexander = new Student("Alexander", "Rousseeuw", email);

	private SmtpMailSender smtpMailSender;

	// change list to array
	String [] emailarray = Alexander.getEmail().toArray(new String[Alexander.getEmail().size()]);

	public RootController(SmtpMailSender smtpMailSender) {
		this.smtpMailSender = smtpMailSender;
	}

	@RequestMapping("/send-mail")
	//go to localhost:8080/send-mail to send the mail

	public void sendMail() throws MessagingException {
		//TESTMAIL
		smtpMailSender.send(emailarray, "Test mail " + Alexander.getFirstName(), "Mail Ontvangen!\n" + Alexander.getFirstName() + " " + Alexander.getLastName());
		
	}

}
