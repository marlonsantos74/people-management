package com.avanade.dio.springbootjwt.service;

import com.avanade.dio.springbootjwt.data.UserData;
import com.sun.tools.javac.util.List;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserDetailsServiceImpl(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws usernameNotFoundException {

        UserData user = findUser(userName);
        if (user == null) {
            throw new usernameNotFoundException(userName);

        }
        return new User(user.getUserName(), user.getPassword(), Collections.emptyList());
    }

    private UserData findUser(String userName) {
        UserData user = new UserData();
        user.setUserName("admmin");
        user.setPassword(bCryptPasswordEncoder.encoder("nimda"));
        return user;

    }
    public List<UserData> listUsers() {
        ArrayList<UserData> lst = new ArrayList<>();
        String userName;
        lst.add(findUser(userName:"admin"));
        return lst;
    }


}
