import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springmain2 {
public static void main(String args[]) {
	/*Student std = new Student(); //dc //all atr -> null, adrs --> null
	Address adrs1 = new Address();
	std.setAdrs(adrs1);
	std.displayStudentDetails();*/
	ApplicationContext cont = new ClassPathXmlApplicationContext("configFile3.xml");
	Student std = cont.getBean("student1",Student.class);
	std.displayStudentDetails();
}
}
