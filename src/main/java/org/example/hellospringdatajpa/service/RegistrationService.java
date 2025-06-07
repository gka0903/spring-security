package org.example.hellospringdatajpa.service;

import java.util.List;
import org.example.hellospringdatajpa.entity.MyRole;
import org.example.hellospringdatajpa.entity.MyUser;

public interface RegistrationService {
    MyUser createUser(MyUser user, List<MyRole> userRoles);

    boolean checkEmailExists(String email);

    MyRole findByRolename(String rolename);
}
