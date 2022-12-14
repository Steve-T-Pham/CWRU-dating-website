package com.cwrudatingwebsite;

import java.util.Collection;
 
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomAccountDetails implements UserDetails {

    private Account account;

    public CustomAccountDetails(Account account){
        this.account = account;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getBio(){
        return account.getBio();
    }
    
    @Override
    public String getPassword() {
        return account.getPassword();
    }

    @Override
    public String getUsername() {
        return account.getUsername();
    }

    public String getEmail(){
        return account.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getFullName() {
        return account.getFirstName() + " " + account.getLastName();
    }
}
