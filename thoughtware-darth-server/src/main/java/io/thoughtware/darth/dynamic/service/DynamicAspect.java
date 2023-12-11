package io.thoughtware.darth.dynamic.service;

import io.thoughtware.core.Result;
import io.thoughtware.user.EnableDynamic;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class DynamicAspect {

    // 定义切点，匹配带有@EnableDynamic注解的方法
    @Pointcut("@annotation(io.thoughtware.user.EnableDynamic)")
    public void dynamicAnnotation() {
    }

    @Around("dynamicAnnotation()")
    public Object aroundEnableDynamic(ProceedingJoinPoint joinPoint) throws Throwable {

        // 执行目标方法
        Result<Object> result =(Result<Object>) joinPoint.proceed();
        int code = result.getCode();

        if (code != 0){
            return result;
        }

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        // 获取注解信息
        EnableDynamic dynamicAnnotation = method.getAnnotation(EnableDynamic.class);
        if (dynamicAnnotation != null) {
            // 获取注解属性值
            String model = dynamicAnnotation.model();
            String type = dynamicAnnotation.type();
            String value = dynamicAnnotation.desc();

        }



        return result;
    }










}
