package com.netease.Spring_AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.netease.Spring_AOP.Calculate.*(..)) && args(a, ..)")
	private void arithmeticDoLog(JoinPoint jp, int a) {
		System.out.println(a + ":" + jp.toString());
	}
	
	@AfterReturning("execution(* com.netease.Spring_AOP.*Service.*(..))")
	private void serviceReturningDoLog(JoinPoint jp) {
		System.out.println(jp.getSignature().toLongString());
		for(Object arg : jp.getArgs()) {
			System.out.print(arg + " ");
		}
		System.out.println("");
	}
	
}
