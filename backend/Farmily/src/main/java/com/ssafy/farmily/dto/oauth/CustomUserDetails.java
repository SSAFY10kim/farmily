package com.ssafy.farmily.dto.oauth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ssafy.farmily.entity.Member;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomUserDetails implements UserDetails {

	private final Member member;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// 현재 User마다 부여된 고유의 ROLE은 없습니다.
		return null;
	}

	@Override
	public String getPassword() {
		return member.getPassword();
	}

	@Override
	public String getUsername() {
		return member.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// expired 유저에 대한 판단 로직 구현X
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// locked 유저에 대한 판단 로직 구현X
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// expired 유저에 대한 판단 로직 구현X
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
