package projectSpring.packae1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JavaDeveloper implements Developers{

	public void toCode() {
		System.out.println(" i am a java developer");
	}
}
