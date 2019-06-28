package kr.co.tiggle.controller;

import kr.co.tiggle.jpa.entity.User;
import kr.co.tiggle.jpa.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/regist")
    public ResponseEntity<Map<String, Object>> userRegist(@ModelAttribute User user, ModelMap modelMap){
        log.info("여기타니?");
        userService.regist(user);
        return new ResponseEntity<>(modelMap, HttpStatus.OK);
    }
}
