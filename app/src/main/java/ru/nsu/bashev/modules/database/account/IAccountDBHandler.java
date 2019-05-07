package ru.nsu.bashev.modules.database.account;

import java.util.List;

import ru.nsu.bashev.model.*;
import ru.nsu.bashev.modules.database.categories.CategoriesDBHandler;

public interface IAccountDBHandler {
    CategoriesDBHandler getCategoriesDBHandler();
    void addAccount(Account account);
    void updateAccount(long id, Account account);
    Account getAccount(long id);
    List<Account> getAccountsByTitle(String titile);
    List<Account> getAccountsByEmail(Email email);
    List<Account> getAccountsByLogin(Login login);
    List<Account> getAllAccounts();
    void deleteAccount(long id);
    void deleteAll();
}
