package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		FakeDataSource faceDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);

		System.out.println(faceDataSource);
	}
}
