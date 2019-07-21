package com.nh;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

//	@Pointcut("execution(* com.nh.*.*(..))")
	@Pointcut("within(com.nh..*)")
	private void all() {
	}

	@Pointcut("execution(* *..get*(..))")
	private void allGet() {
	}

	@Before("all()")
	public void beforeAdvice() {
		System.out.println("Before Advice Called!!");
	}

	@After("all()")
	public void afterAdvice() {
		System.out.println("After Advice Called!!");
	}

	/*
	 * @Around("all()") public void aroundAdvice(ProceedingJoinPoint joinPoint)
	 * throws Throwable {
	 * 
	 * System.out.println("aroundAdvice() is running!");
	 * System.out.println("Method Name : " + joinPoint.getSignature().getName());
	 * System.out.println("Method arguments : " +
	 * Arrays.toString(joinPoint.getArgs()));
	 * 
	 * System.out.println("Around Before Advice Called!!"); joinPoint.proceed(); //
	 * continue on the intercepted method
	 * System.out.println("Around After Advice Called!!");
	 * 
	 * }
	 */

	@AfterReturning(pointcut = "allGet()", returning = "retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning:" + retVal.toString());
	}

	@AfterThrowing(pointcut = "execution(* com.nh.*.*(..))", throwing = "error")
	public void afterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("afterThrowing() is running!");
		System.out.println("Method Name : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);

	}

}
