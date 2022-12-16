

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class driverClss {

	public static void main(String args[]) {
		/*//compile t poly
		Triangle triangleObj = new Triangle();
		triangleObj.calculateArea();
		
		square squareObj = new square();
		squareObj.calculateArea();*/
		
		//2 forms --> im refer parent t (drawable) rt poly
		//memory occ --> trian
		//1000L = 500l  //parents --> accomadte u 
		/*Drawable draw = new square();
		draw.calculateArea();
*/
		ApplicationContext cont = new ClassPathXmlApplicationContext("config3.xml");
		/*Triangle obj = cont.getBean("triangle1", Triangle.class);
		obj.calculateArea();
		
		square sobj = cont.getBean("sqr", square.class);
		sobj.calculateArea();
		
	Drawable dobj = cont.getBean("interface", square.class);
		dobj.calculateArea();*/
		
		/*Learners learnerObj = cont.getBean("learnerObj", Learners.class);
		learnerObj.display();
		Learners learnerObj1 = cont.getBean("objwithageval", Learners.class);
		learnerObj1.display();
		Learners learnerObj2 = cont.getBean("objwithnameval", Learners.class);
		learnerObj2.display();*/
		
		}
}
