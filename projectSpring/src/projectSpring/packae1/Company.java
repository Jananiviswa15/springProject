package projectSpring.packae1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//default bean id--> clsname with 1st ltr in smal, company
//@Component("differentName")
@Component //when  u want to craeet bean for that cls u ll add this annot
public class Company {

	@Value("Amazon")
	private String companyName;

	@Autowired	
	private Manager manager;

	@Autowired
	//Qualifier here also u can use (give name of jd/ pd
	private Developers developr; //= new JavaDeve() or new pythonDev()
	/*private JavaDeveloper jd;
	private pyhtonDeveloper pd;*/
	public Company() {}
	public Company(Manager manager,Developers developr) {}
	//new Manager()
	public Company(Manager manager) {
		System.out.println("following CI for manager");
		this.manager = manager;
	}

	void displayCompanyDetails() {
		System.out.println("company name is : "+ companyName);
		manager.displayManagerDetails();
		developr.toCode(); //python / java
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	//@Autowired(i was checking for amnager type obj in ioc cont, if fails i ll go for byname)
	
	public void setManager(Manager manager) {
		System.out.println(" i am fillowing setter I ");
		this.manager = manager;
	}
	
//	@Autowired
	//@Qualifier("pyhtonDeveloper")
	public void setDevelopr(Developers developr) {
		System.out.println("SI for developer (java / python");
		this.developr = developr;
	}
}
