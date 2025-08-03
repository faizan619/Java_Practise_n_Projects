package com.springsec2.config;

// import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    // @Autowired
    // private UserDetailsService userDetailsService;


    @Bean
    public SecurityFilterChain securityFilterChaining(HttpSecurity http) throws Exception{

        // // it will disable the csrf token
        // http.csrf(customizer -> customizer.disable());
        // // it will only to access only then authenticated users
        // http.authorizeHttpRequests(request -> request
        //                                             .requestMatchers("register","login")
        //                                             .permitAll()
        //                                             .anyRequest().authenticated()
        //                         );
        // // this will give a default form to enter the login credentials
        // http.formLogin(Customizer.withDefaults());
        // // this will allow to use the thunder cloud or postman to use REST Access
        // http.httpBasic(Customizer.withDefaults());
        // // this is use to make the application stateless for sending data though sessions and with each request it will ask for session
        // // http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        // return http.build();

        return http
            .csrf(customizer -> customizer.disable())
            .authorizeHttpRequests(request -> request
                                                .requestMatchers("register","login")
                                                .permitAll()
                                                .anyRequest().authenticated())
            .formLogin(Customizer.withDefaults())
            .httpBasic(Customizer.withDefaults())
            // .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .build();
    }

    // @Bean 
        // public UserDetailsService userDetailsService(){

        //     UserDetails user1 = User
        //                 .withDefaultPasswordEncoder()
        //                 .username("kiran")
        //                 .password("k@123")
        //                 .role("USER")
        //                 .build();
        //     UserDetails user2 = User
        //                 .withDefaultPasswordEncoder()
        //                 .username("nitin")
        //                 .password("n@123")
        //                 .role("ADMIN")
        //                 .build();

        //     return new InMemoryUserDetailsManager(user1, user2);
    // }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        return provider;
    }

}
