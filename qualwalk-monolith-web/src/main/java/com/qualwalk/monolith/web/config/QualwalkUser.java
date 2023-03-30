//package com.qualwalk.monolith.web.config;
//
//import lombok.AllArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import java.util.Collection;
//
//@AllArgsConstructor
//public class QualwalkUser implements UserDetails {
//
//    private String username;
//    private Collection<? extends GrantedAuthority> authorities;
//    private String password;
//    private boolean isAccountNonExpired;
//    private boolean isAccountNonLocked;
//    private boolean isCredentialsNonExpired;
//    private boolean isEnabled;
//
//    private String organization;
//
//    public String getOrganization() {
//        return organization;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return isAccountNonExpired;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return isAccountNonLocked;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return isCredentialsNonExpired;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return isEnabled;
//    }
//}
