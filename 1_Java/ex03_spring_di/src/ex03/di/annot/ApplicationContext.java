package ex03.di.annot;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//설정파일 역할을 하는 annotaion : Configuration

@Configuration // spring 설정에 사용되는 클래스임을 명시 <--- ctx.xml 과 같다.
public class ApplicationContext {
	
	@Bean // 객체(bean) 생성을 어노테이션으로 함.
	public MyCats cat1() {
		ArrayList<String> hobbys = new ArrayList<String>();	
		hobbys.add("꾹꾹이");
		hobbys.add("뒹굴기");
		
		MyCats myCats = new MyCats("쿠키", 13, hobbys); // 생성자
		myCats.setWeight(15.3);
		myCats.setColor("brawn");
		
		return myCats;
	}
	
	@Bean
	public MyCats cat2() {
		ArrayList<String> hobbys = new ArrayList<String>();	
		hobbys.add("앞발들기");
		hobbys.add("윙크");
		
		MyCats myCats = new MyCats("냐옹이", 2, hobbys); // 생성자
		myCats.setWeight(2.3);
		myCats.setColor("white");
		
		return myCats; // MyCats 객체 리턴
	}

	@Bean
	public Cats catsInfo() {
		Cats cats = new Cats(this.cat1());
		
		return cats;
	}
}
