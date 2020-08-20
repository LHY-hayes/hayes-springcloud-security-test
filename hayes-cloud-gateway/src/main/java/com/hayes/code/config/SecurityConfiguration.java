package com.hayes.code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.RedirectServerAuthenticationEntryPoint;

@EnableWebFluxSecurity
public class SecurityConfiguration {


    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        RedirectServerAuthenticationEntryPoint loginPoint = new RedirectServerAuthenticationEntryPoint("/system/index");
        http.authorizeExchange().pathMatchers("/auth/**").permitAll()
                .and().formLogin().loginPage("/auth/login").authenticationEntryPoint(loginPoint)
                .and().authorizeExchange().anyExchange().authenticated()
                .and().csrf().disable();
        SecurityWebFilterChain chain = http.build();
        return chain;
    }


}
