package com.latihan.produk.LatihanProduk.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api")
public class HomeController {
    @RequestMapping("/home")
	public String helloPage() {
		return "index";
	}
    
    @GetMapping("/index")
	public String index() {
		return "Welcome...";
	}
    
    @RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		HttpSession session= request.getSession(false);
		SecurityContextHolder.clearContext();
    	session= request.getSession(false);
	    if(session != null) {
	        session.invalidate();
	    }
	    for(Cookie cookie : request.getCookies()) {
	        cookie.setMaxAge(0);
	    }

	    return "Berhasil Logout...";
	}
}
