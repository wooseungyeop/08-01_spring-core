package com.ohgiraffers.section03.annotationconfig.subsection02.xml;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("section03/annotationconfig/subsection02/xml/spring-context.xml");

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName : " + beanName);
        }
        MemberDAO memberDAO = context.getBean("memberDAO", MemberDAO.class);
        System.out.println(memberDAO.selectMember(1));
        System.out.println(memberDAO.insertMember(new MemberDTO(3, "user03", "pass03", "신상임당")));
        System.out.println(memberDAO.selectMember(3));
    }
}
