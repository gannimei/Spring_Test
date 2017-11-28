package com.netease.Spring_AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.netease.Spring_AOP.Calculate.*(..)) && args(a, ..)")
	private void arithmeticDoLog(JoinPoint jp, int a) {
		System.out.println(a + ":" + jp.toString());
	}
	
}
