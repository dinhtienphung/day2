package anotation;

import day2.Pojo.Account;
import day2.Pojo.AccountRepo;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountRepoImp2 implements AccountRepo {


    private Map<Long, Account> accountsMap;

    @PostConstruct
    public void initData ()
    {
        accountsMap = new HashMap<>();
        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwenerName("tai");
        account1.setBalance(10.0);

        Account account2 = new Account();
        account2.setId(2L);
        account2.setOwenerName("phung");
        account2.setBalance(2.0);

        accountsMap.put(account1.getId(), account1);
        accountsMap.put(account2.getId(), account2);

    }

    @Override
    public void insert(Account account) {
    }

    @Override
    public void update(Account account) {

    }

    @Override
    public Account find(long AccountID) {
        return accountsMap.get(AccountID);
    }
}
