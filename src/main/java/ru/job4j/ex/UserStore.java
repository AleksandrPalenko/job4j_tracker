package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                rsl = i;
                break;
            }
            return users[i];
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

