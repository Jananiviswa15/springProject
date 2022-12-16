package BeansFactoryEg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainClassBeansFact {

	public static void main(String[] args) {
		
//BeanFactory beanfact = new XmlBeanFactory(new ClassPathResource("Beansfatc.xml") );
		ApplicationContext appCont = new ClassPathXmlApplicationContext("Beansfatc.xml");
GreetingClass greetObj = appCont.getBean("obj1", GreetingClass.class);
greetObj.display();

	}

}
