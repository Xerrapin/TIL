package ex01.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				 new String[] {"services.xml", "ex01/di/applicationctx.xml", "ex01/di/appContext.xml"});
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex01/di/ctx.xml");
		
//		MessageBeanImpl bean = (MessageBeanImpl) context.getBean("messageBeanImpl"); // 형변환
		MessageBean bean = context.getBean("messageBeanImpl", MessageBeanImpl.class); // 클래스 이름 쓰기
		bean.sayHello();
	
		MessageBean bean2 = context.getBean("m1", MessageBeanImpl.class); // 클래스 이름 쓰기
		bean2.sayHello();

	}
}
