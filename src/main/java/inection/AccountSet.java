package inection;

import day2.Pojo.Account;
import day2.Pojo.AccountRepo;
import day2.Pojo.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountSet implements AccountService {

    private AccountRepo accountRepository;

    public void setAccountRepository(AccountRepo accountRepo) {
        this.accountRepository = accountRepo;
    }

    @Override
    public void transferMoney(long fromAccountID, long toAccountID, double amount) {


        Account sourceAccount = accountRepository.find(fromAccountID);
        Account targeAccount = accountRepository.find(toAccountID);
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        targeAccount.setBalance(targeAccount.getBalance() + amount);
        accountRepository.update(sourceAccount);
        accountRepository.update(targeAccount);
    }

    @Override
    public void depositMoney(long accountID, double amount) throws Exception {
        Account account = accountRepository.find(accountID);
        account.setBalance(account.getBalance() + amount);
        accountRepository.update(account);
    }

    @Override
    public Account getAccount(long accountID) {
        return accountRepository.find(accountID);
    }
}
