package com.example;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    @GetMapping("/userdetails")
    public OAuth2User userdetails(@AuthenticationPrincipal OAuth2User principal) {
        return principal;
    }
    @GetMapping("/user")
    public Map<String,Object> user(){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        OAuth2User user=(OAuth2User) authentication.getPrincipal();
        Map<String,Object>map=new HashMap<>();
        map.put("name :",user.getAttribute("name"));
        map.put("comapny :",user.getAttribute("company"));
        return map;

    }
}
