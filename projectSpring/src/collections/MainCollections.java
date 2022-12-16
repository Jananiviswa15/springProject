package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollections {

	public static void main(String args[]) {
	ApplicationContext ioc = new ClassPathXmlApplicationContext("Collections.xml");
	Questions question = ioc.getBean("obj1",Questions.class);
	question.display();
	
	}
}
