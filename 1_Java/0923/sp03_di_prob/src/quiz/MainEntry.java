package quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("quiz/appCtx.xml");
		
		Student stu = context.getBean("stu", Student.class);
		stu.show();
				
		Employee emp = context.getBean("emp", Employee.class);
		emp.show();
	}
}
