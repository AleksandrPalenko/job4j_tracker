package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User log : users) {
            if (log.getUsername().equals(login)) {
                return log;
            }
        }
        throw new UserNotFoundException("Such a user is not found in system");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("The user is not Valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Aleksandr Palenko", true)
        };
        try {
            User user = findUser(users, "Aleksandr Palenko");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException an) {
            an.printStackTrace();
        }
    }
}

