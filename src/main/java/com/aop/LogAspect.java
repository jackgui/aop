package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("logAspect")
public class LogAspect {

	public void doBefor(JoinPoint joinpoint) {
		System.out.println("############start doBefor#############");
		System.out.println("目标对象:" + joinpoint.getTarget().getClass());
		System.out.println("kind:" + joinpoint.getKind());
		System.out.println("args:" + joinpoint.getArgs().length);
		System.out.println("signature:"+joinpoint.getSignature());
		System.out.println("this:"+joinpoint.getThis().getClass());
		System.out.println("############end doBefor#############");
	}

	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("doAround");
		return pjp.proceed();
	}

	public void doAfter(JoinPoint joinpoint) {
		System.out.println("doAfter");
	}

	public void doThrow(JoinPoint joinPoint, Throwable ex) {
		System.out.println("doThrow");
	}

	public void returning(Object obj) {
		System.out.println("returning");
	}

}
