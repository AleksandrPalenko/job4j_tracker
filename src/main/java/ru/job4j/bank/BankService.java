package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport); //находим пользователя по паспотрту
        if (user != null) {
            List<Account> userAccount = users.get(user); //получем список всех счетов пользователя
            // проверияем что полученный выше список не содержит добавляемый аккаунт
            if (!userAccount.contains(user)) {
                userAccount.add(account); //добавляем новый счет пользователю
            }
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User value : users.keySet()) {
            if (value.getPassport().equals(passport)) {
                rsl = value;
                break;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }
        }

        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 double amount) {
        boolean rsl = false;
        Account srcAccount1 = findByRequisite(srcPassport, srcRequisite);
        Account srcAccount2 = findByRequisite(destPassport, destRequisite);
        if (srcAccount1 != null && srcAccount2 != null && srcAccount1.getBalance() >= amount) {
            srcAccount1.setBalance(srcAccount1.getBalance() - amount);
            srcAccount2.setBalance(srcAccount2.getBalance() + amount);
            return true;
        }

        return rsl;
    }
}
