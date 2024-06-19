package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

public class Application01 {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO memberDTO = (MemberDTO) context.getBean("member");
        System.out.println(memberDTO);
    }
}
