package day2.xmlbasedconfiguration;

import day2.Pojo.Compa;
import day2.Pojo.StudentMethod;
import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.MBeanExportConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlbasedconfiguration/beans.xml");
//      AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

//        System.out.println("Before money stransfer");
//        System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
//        System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
//
//        accountService.transferMoney(1,2,5.0);
//        System.out.println("===================================");
//        System.out.println("After money transfer");
//        System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
//        System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
          Compa compa = applicationContext.getBean("compa", Compa.class);

                compa.drawCircle(1, "ty", 14.5);

    }




}
