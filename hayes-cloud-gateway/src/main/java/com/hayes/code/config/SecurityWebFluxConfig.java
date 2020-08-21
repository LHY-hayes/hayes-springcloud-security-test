package com.hayes.code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityWebFluxConfig {

    @Bean
    public SecurityWebFilterChain webFluxSecurityFilterChain(ServerHttpSecurity http){

        http.authorizeExchange()
                .pathMatchers("/auth/**").permitAll()
                .anyExchange().authenticated()
                .and()
                .formLogin().loginPage("/auth/login")
                
                .and().csrf().disable();

        return http.build();

    }


}
