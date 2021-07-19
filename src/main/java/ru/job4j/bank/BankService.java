package ru.job4j.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> userAccount = users.get(user.get());
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

    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет пользователя по реквизитам счета
     *
     * @return возвращает пользователя или null если такого пользователя нет
     */

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> rsl = Optional.empty();
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();
        }
        return rsl;
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
        Optional<Account> srcAccount1 = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> srcAccount2 = findByRequisite(destPassport, destRequisite);
        if (srcAccount1.isPresent() && srcAccount2.isPresent()) {

            if (srcAccount1.get().getBalance() >= amount) {
                srcAccount1.get().setBalance(srcAccount1.get().getBalance() - amount);
                srcAccount2.get().setBalance(srcAccount2.get().getBalance() + amount);
                rsl = true;
            }
        }

        return rsl;
    }
}
