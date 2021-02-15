package com.icarus.userservice.service;

import com.icarus.userservice.model.User;
import com.icarus.userservice.repository.UserRepository;
import com.icarus.userservice.valueobject.Department;
import com.icarus.userservice.valueobject.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplate findUserWithDepartment(Long userId) {
        ResponseTemplate rt = new ResponseTemplate();
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
                Department.class);
        rt.setUser(user);
        rt.setDepartment(department);
        return rt;
    }
}
