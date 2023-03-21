package com.example.secservice.service;

import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl {
    /*
    @Autowired
    private AccountService accountService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = accountService.loadUserByUsername(username);
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(appUser.getRole().getRoleName()));
        return new User(appUser.getUsername(), appUser.getPassword(), authorities);    }*/
}
