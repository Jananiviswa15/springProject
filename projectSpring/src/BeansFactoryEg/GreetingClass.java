package BeansFactoryEg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class GreetingClass {

//	@Required // @required cant be used acrs attr lvl
	private String name;
	private int rollNum;
	
	@Value("helloooo")
	private String greetMsg;
	

	//@Value("good")
	public void setGreetMsg(String greetMsg) {
		this.greetMsg = greetMsg;
	}
	
	
	public void display() {
		System.out.println("helloo :"+name + "my meesgae is "+greetMsg+rollNum);
	}


	@Required // you can use it before version 6
	public void setName(String name) {
		this.name = name;
	}

	@Value("23")
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
}
