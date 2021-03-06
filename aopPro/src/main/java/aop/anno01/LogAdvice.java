package aop.anno01;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//모든 클래스에 적용할(조건)공통의 모듈 = 비즈니스로직 외적인 부분(ex. 보안, 로깅..)

@Service
//aop가 선언되어있는 클래스라는 것을 정의( aop 기능을 적용해서 비즈니스 로직에 추가할 공통관심모듈이라는 것을 정의 )
@Aspect
public class LogAdvice {
	//포인터 컷을 정의할 때 메소드를 정의해서 적용 : 메소드명이 포인트 컷 명이 된다.
	@Pointcut("execution(* aop.anno01.UserDAO.get*(..))")
	public void myLogPointcut() {
	}
	@After("myLogPointcut()")
	public void log() {
		System.out.println("===============로그기록===============");
	}
}
