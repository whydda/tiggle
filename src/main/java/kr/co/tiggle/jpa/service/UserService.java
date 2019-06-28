package kr.co.tiggle.jpa.service;

import kr.co.tiggle.jpa.entity.User;
import kr.co.tiggle.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

@Service
public class UserService {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User regist(User user) {
        user.setPass(bCryptPasswordEncoder.encode(user.getPass()));
        user.setRegId(user.getId());
        user.setRegiDate(LocalDate.now());
        userRepository.save(user);
        return user;
    }
}
