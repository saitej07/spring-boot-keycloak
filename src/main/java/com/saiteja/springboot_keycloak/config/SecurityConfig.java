package com.saiteja.springboot_keycloak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
      return http.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated())
              .oauth2ResourceServer(oauth -> oauth.jwt(Customizer.withDefaults()))
               .build();
    }
}
