package projectSpring.packae1;

import org.springframework.stereotype.Component;

@Component("pyhtonDeveloper")
public class pyhtonDeveloper implements Developers {
	public void toCode() {
		System.out.println(" i am a python developer");
	}
}
