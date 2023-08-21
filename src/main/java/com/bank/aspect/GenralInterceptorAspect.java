package com.bank.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.bank.entity.Loan;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class GenralInterceptorAspect {
	
	Logger logger = LoggerFactory.getLogger(GenralInterceptorAspect.class);


	//@Pointcut("execution(* com.bank.controller.*.*(..))")
	//@Pointcut("within(com.bank..*)")
	//@Pointcut("this(com.bank,service.impl.LoanServiceImpl)")
	@Pointcut("@annotation(com.bank.annotation.CustomAnnotation)")
	public void loggingPointCut() {
		
	}
	
//	@Before(value = "loggingPointCut()")
//	public void before(JoinPoint joinPoint) {
//		logger.info("Before Method Invoked :: "+joinPoint.getSignature());
//	}
//	
//	@After(value = "loggingPointCut()")
//	public void after(JoinPoint joinPoint) {
//		logger.info("After Method Invoked :: "+joinPoint.getSignature());
//	}
	
//	@AfterReturning(value = "execution(* com.bank.controller.*.*(..))",returning = "loan")
//	public void afterReturn(JoinPoint joinPoint, Loan loan) {
//		logger.info("After Method Invoked Returning :: "+loan);
//	}
//	
//	@AfterThrowing(value = "execution(* com.bank.controller.*.*(..))", throwing = "e")
//	public void afterReturn(JoinPoint joinPoint, Exception e) {
//		logger.info("After Method Invoked Throwing :: "+e.getMessage());
//	}
	
	@Around("loggingPointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
	
		logger.info("Before Method Invoked :: "+joinPoint.getSignature());
		
		Object object = joinPoint.proceed();
	
		if(object instanceof Loan)
			logger.info("After Method Invoked :: "+joinPoint.getSignature());
		
		return object;
	}
	
}
