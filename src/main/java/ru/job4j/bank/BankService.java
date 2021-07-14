package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу простейшей очереди по приоритету, которая работает
 * по принципу FIFO (first in - first out)
 *
 * @author Aleksandr Palenko
 * @version 1.0
 */

public class BankService {
    /**
     * Хранение задания осуществляется в коллекции типа HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * @param user аккаунт добваляется в систему
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * @param account добваляется счет к пользователю
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccount = users.get(user);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     *
     * @return возвращает пользователя или null если такого пользователя нет
     */

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
}

    /**
     * Метод ищет пользователя по реквизитам счета
     *
     * @return возвращает пользователя или null если такого пользователя нет
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     * Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят),
     * то метод должен вернуть false
     *
     * @return возвращает true или false,  если одного из счетов не существует
     * и если сумма перечисление денег превышает суммы денег на счете
     */

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

        return false;
    }
}
