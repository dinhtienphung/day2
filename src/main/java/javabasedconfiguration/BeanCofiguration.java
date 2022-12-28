package javabasedconfiguration;

import day2.Pojo.AccountRepo;
import day2.Pojo.AccountRepoImpl;
import day2.Pojo.AccountService;
import day2.Pojo.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCofiguration {

    @Bean
    public AccountService accountService () {
        AccountServiceImpl bean = new AccountServiceImpl();

        bean.setAccountRepository(accountDao());
        return bean;
    }

    @Bean
    public AccountRepo accountDao() {
        AccountRepoImpl bean = new AccountRepoImpl();
        return bean;
    }



}
