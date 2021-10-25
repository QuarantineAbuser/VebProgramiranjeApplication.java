package mk.ukim.finki.vebprogramiranje.service;

import mk.ukim.finki.vebprogramiranje.model.User;

public interface AuthService {

    User login(String username, String password);

    User register(String username, String password, String repeatPassword, String name, String surname);
}
