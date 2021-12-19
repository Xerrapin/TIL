package quiz;

import org.aspectj.lang.ProceedingJoinPoint;

//XML 기반 POJO 방식의 AspectJ를 이용한 AOP 방법
public class LogAdvice {
//	Around 방식의 사전/사후 처리 AOP around 방식으로 할때는
//	인수는 ProceedingJoinPoint, 리턴 - Object 함수
	
	public Object around(ProceedingJoinPoint point) throws Throwable {
		String methodName = point.getSignature().getName();
		System.out.println("[LOG ] " + methodName +"실행 전");
		Object obj = point.proceed(); 
		System.out.println("[LOG ] " + methodName +" 실행 후");
		return obj;
	}
}
