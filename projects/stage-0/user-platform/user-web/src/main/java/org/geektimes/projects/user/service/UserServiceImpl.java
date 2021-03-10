package org.geektimes.projects.user.service;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.sql.DBConnectionManager;
import org.geektimes.projects.user.validator.ValidatorUtils;

public class UserServiceImpl implements UserService{

    DatabaseUserRepository databaseUserRepository = new DatabaseUserRepository(new DBConnectionManager());

    @Override
    public boolean register(User user) {
        ValidatorUtils.validateEntity(user);
        return databaseUserRepository.save(user);
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return databaseUserRepository.getByNameAndPassword(name, password);
    }

    public static void main(String[] args) {
        //注册
        User user = new User();
        user.setName("Cutie");
        user.setPassword("*****");
        user.setPhoneNumber("18700000000");
        user.setEmail("cutie@gmail.com");
        new UserServiceImpl().register(user);
        //查询
        System.out.println(new UserServiceImpl().queryUserByNameAndPassword("Cutie", "******"));
    }
}
