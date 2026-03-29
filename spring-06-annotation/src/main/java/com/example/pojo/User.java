package com.example.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
* @Component组件
* 等价于 <bean id="user" class="com.example.pojo.User">
* Scope注解可以声明单例还是多例
* */
@Component
@Scope("singleton")
public class User {

    // 等价于<property name="name" value="kaungshen"/>
    @Value("kaungshen")
    public String name;
}


/*
* @Component有几个衍生注解，我们在web开发中，会按照mvc三层架构分层
* dao层： @Repository
* service层： @Service
* controller层： @Controller
* 这四个注解功能是一样的，都是代表将某个类注册到spring当中，装配bean
* */
