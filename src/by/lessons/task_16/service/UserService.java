package by.lessons.task_16.service;


import by.lessons.task_16.entity.User;
import by.lessons.task_16.exception.NotCorrectPasswordException;
import by.lessons.task_16.repository.UserRepository;

public class UserService {
    public User authenticate (String login, String password) {
        UserRepository userRepository = new UserRepository();
        User user = userRepository.searchUserByLogin(login);
        if (user.getPassword().equals(password)) {
            return user;
        }
        throw new NotCorrectPasswordException("Пароль не совпадает!");
    }
}
