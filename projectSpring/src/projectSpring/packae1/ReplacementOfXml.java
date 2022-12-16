package projectSpring.packae1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //replacemnet of .xml
public class ReplacementOfXml {
	/*//singleton pattern
	@Bean
	public Manager createMangerBean() {
		return new Manager();
	}
	
	@Bean 
	public Developers createDevBean() {
		return new pyhtonDeveloper();  //new pythonDeveloper
	}
	
	
	/*@Bean 
	public JavaDeveloper createDevBean() {
		return new JavaDeveloper();
	}
	@Bean 
	public pythonDeveloper createDevBean() {
		return new pythonDeveloper();
	}
//which cls u want craete obj
	//what is the obj name
//	<bean id= "objname" class = "className">
	//<bean id = company1 class = "Company">
	//<bean id = company2 class = "Company">
	
	//@Bean(name = {"company1","company2"}) //more than 1 obj of company type
	//if u dont give bean name(method name ll acting as bean name)
	@Bean
	public Company createCompBean() {
		//return new Company(createMangerBean(),createDevBean);  // new Company(new Manager()); //ci
		Company company1 = new Company();    //company1.mager = null, dc
		company1.setManager(createMangerBean());
		company1.setDevelopr(createDevBean());
		return company1;
	}
*/
	
}
