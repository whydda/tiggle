package kr.co.tiggle.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CommonController {

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> loginPage(ModelMap modelMap){
        modelMap.put("aaa", "a");
        return new ResponseEntity<>(modelMap, HttpStatus.OK);
    }
}
