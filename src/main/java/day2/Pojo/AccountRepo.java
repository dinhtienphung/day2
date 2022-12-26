package day2.Pojo;

public interface AccountRepo {
    void insert (Account account);
    void update (Account account);
    Account find(long AccountID);
}
