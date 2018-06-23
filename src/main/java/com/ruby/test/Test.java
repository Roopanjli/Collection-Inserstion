package com.ruby.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ruby.bean.Student;

public class Test {
public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/ruby/cfg/ApplicationContext.xml"));
	Student st=factory.getBean("student",Student.class);
	System.out.println(st);
}
}