package collections;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Questions {
private int id;
private String name;
//autowired --> add contecxt annot config in xml
//private List<String> answers;
//private Set<Integer> phNum;
//key and value --> key cant be duplicate , val --> can be dup
private Map<Integer, String> nameList;

//public Questions() {}


/*public Questions(int id, String name, List<String> answers) {
	this.id = id;
	this.name = name;
	this.answers = answers;
}*/

//SI --> public getters and setters  / u can add @autowried to setter method (list<string
//CI --> constr


public void display() {
	System.out.println("details of the person..."+ id +" "+name);
	for(Map.Entry<Integer,String> map : nameList.entrySet()) {
		System.out.println(map.getKey() +"," +map.getValue());

	}
	/*Iterator<Integer>  itr = nameList.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}*/
}

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public void setNameList(Map<Integer, String> nameList) {
	this.nameList = nameList;
}

/*public void setPhNum(Set<Integer> phNum) {
	this.phNum = phNum;
}*/


}
