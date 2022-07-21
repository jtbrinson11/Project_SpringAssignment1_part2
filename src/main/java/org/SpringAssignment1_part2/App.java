package org.SpringAssignment1_part2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringAssignment1_part2.xml");
        student stud = (student) context.getBean("student");
        System.out.println(stud);
    }
}
