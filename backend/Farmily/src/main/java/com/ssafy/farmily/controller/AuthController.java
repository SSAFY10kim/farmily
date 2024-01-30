package com.ssafy.farmily.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin("*")
@RequestMapping("/auth")
@Slf4j
public class AuthController {

	@GetMapping("/test")
	@PreAuthorize("hasRole('ROLE_USER')")
	public ResponseEntity<String> testGetUserInfo(@AuthenticationPrincipal String username) {
		return ResponseEntity.ok("username: " + username);
	}

	@GetMapping("/token")
	public ResponseEntity<String> issueAccessToken(@CookieValue("accessToken") String accessToken) {
		return ResponseEntity.ok("accessToken: " + accessToken);
	}
}
