package com.notifications.notifications.service;

import com.notifications.notifications.entity.User;
import com.notifications.notifications.genericDAO.GenericDAO;
import com.notifications.notifications.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements GenericDAO<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User saveOrUpdate(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public boolean deleteById(Long id) {
        userRepository.deleteById(id);
        return true;
    }
}
