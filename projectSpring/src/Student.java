import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
//private String name;
//	@Autowired  //before attr no need of setter methods
	//@Qualifier("adrsObj1")
private AddressInter adrsInter ;//= new Address(), new offcieAddres();

/*private Address adrs;  //object and it is attr
private officeAddres oadrs;
//a std ll b having both offc and personal adrs */
/*public Address getAdrs() {
	return adrs;
}

public void setAdrs(Address adrs) {
	this.adrs = adrs;
}

public Student() {
	
}
//@Autowired  //equivalent to "autowire = constructor" in xml
public Student(AddressInter adrsInter) {
	System.out.println("autowire = constructor");
	this.adrsInter = adrsInter;
}
*/
//std //this
public void displayStudentDetails() {
	System.out.println("i am student ");
	adrsInter.displayAddress();
	//adrs.displayAddress();  //std.adrs //this.adrs
	//oadrs.displayAddress();
}

/*public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}*/

public AddressInter getAdrsInter() {
	return adrsInter;
}

@Autowired//1st it ll check byTYpe next it ll go to byName
@Qualifier("offcAdrs")
public void setAdrsInter(AddressInter adrsInter) {
	System.out.println("byTYpe or byname ll follow setter injection");
	this.adrsInter = adrsInter;
}

/*public officeAddres getOadrs() {
	return oadrs;
}

public void setOadrs(officeAddres oadrs) {
	this.oadrs = oadrs;
}*/
}
