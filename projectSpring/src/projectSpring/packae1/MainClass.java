package projectSpring.packae1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//ApplicationContext cont = new ClassPathXmlApplicationContext("configFile3.xml");
		//ApplicationContext appCont = new AnnotationConfigApplicationContext(ReplacementOfXml.class);
		
		//when erv u try to read the components from xml
	//	ApplicationContext appCont = new ClassPathXmlApplicationContext("ReadComponent.xml");
		
		
		//read the config file through @config
		ApplicationContext appCont = new AnnotationConfigApplicationContext(configClassForComponents.class);
		System.out.println("i read the config file");
	//	Company company1 = appCont.getBean("createCompBean",Company.class);
		Company company1 = appCont.getBean("company",Company.class);
		company1.displayCompanyDetails();
	}

}
