package com.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringTest {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("contex.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		
		Student s = (Student)bf.getBean("studentbean");
		System.out.println(s.hashCode());
		System.out.println(s.subject.hashCode());
		
		Student s2 = (Student)bf.getBean("studentbean");
		System.out.println(s2.subject.hashCode());
		
		Subject su = (Subject)bf.getBean("subject");
		System.out.println(su.hashCode());
		
		Subject su2= (Subject)bf.getBean("subject");
		System.out.println(su2.hashCode());
		
		System.out.println("room:"+s.classRoom().hashCode());
		System.out.println("room:"+s.classRoom().hashCode());
	}

}
