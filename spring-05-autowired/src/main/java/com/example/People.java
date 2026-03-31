package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import javax.annotation.Resource;

public class People {
    /*
    @Resource和@Autowired的区别：
     都是用来自动装配的，都可以使用在属性字段上；
     @Autowired通过byType的方式实现；而且必须要求这个对象存在；
     @Resource默认通过byName的方式实现；如果找不到名字，则通过byType的方式实现；如果两个方式都找不到，就报错
     执行顺序不同：@Autowired通过byType的方式实现； @Resource默认通过byName的方式实现；
     */
    // 如果显示定义了Autowired的required属性为false，说明这个对象可以为null，否则不许为空
    @Autowired(required = false)
    private Cat cat;

    // 如果Autowired自动装配的环境比较复杂，自动装配无法通过一个注解【Autowired】完成的时候
    // 我们可以使用@Qualifier(value = "dog")去配合Autowired的使用，指定一个唯一的bean对象注入
    @Autowired
    @Qualifier(value = "dog")
    //@Resource(name = "dog")
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
