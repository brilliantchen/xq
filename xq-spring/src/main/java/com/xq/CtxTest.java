package com.xq;

import com.xq.modle.Student;
import com.xq.modle.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class CtxTest {

  public static void main(String[] args) throws Exception{

    ApplicationContext appCt2 = new FileSystemXmlApplicationContext("classpath:applicationContext-beans-test1.xml");
    Student st = (Student) appCt2.getBean("student");
    Teacher teacher = (Teacher) appCt2.getBean("teacher");


  }

}
