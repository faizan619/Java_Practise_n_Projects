package com.securitySpring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.Customizer;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
// import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
// import org.springframework.security.web.util.matcher.RequestMatcher;
// import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChaining(HttpSecurity http) throws Exception{

        // it will disable the csrf token
        http.csrf(customizer -> customizer.disable());

        // it will only to access only then authenticated users
        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());

        // this will give a default form to enter the login credentials
        http.formLogin(Customizer.withDefaults());

        // this will allow to use the thunder cloud or postman to use REST Access
        http.httpBasic(Customizer.withDefaults());

        // this is use to make the application stateless for sending data though sessions and with each request it will ask for session
        // http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();

        // return http
        //     .csrf(customizer -> customizer.disable())
        //     .authorizeHttpRequests(request -> request.anyRequest().authenticated())
        //     .formLogin(Customizer.withDefaults())
        //     .httpBasic(Customizer.withDefaults())
        //     .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        //     .build();
    }

    // @Bean
    // public SecurityFilterChain securityFilterChaining1(HttpSecurity http) throws Exception {

        //     // 1. Disable CSRF using non-lambda
        //     http.csrf(new Customizer<CsrfConfigurer<HttpSecurity>>() {
        //         @Override
        //         public void customize(CsrfConfigurer<HttpSecurity> csrf) {
        //             csrf.disable();
        //         }
        //     });
        //     // 2. Authorize all requests to be authenticated
        //     http.authorizeHttpRequests(new Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry>() {
        //         @Override
        //         public void customize(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry registry) {
        //             registry.anyRequest().authenticated();
        //         }
        //     });
        //     // 3. Enable HTTP Basic authentication
        //     http.httpBasic(new Customizer<AbstractHttpConfigurer<HttpSecurity, ?>>() {
        //         @Override
        //         public void customize(AbstractHttpConfigurer<HttpSecurity, ?> configurer) {
        //             // Defaults will be applied automatically
        //         }
        //     });
        //     // 4. Set session management to stateless
        //     http.sessionManagement(new Customizer<org.springframework.security.config.annotation.web.configurers.SessionManagementConfigurer<HttpSecurity>>() {
        //         @Override
        //         public void customize(org.springframework.security.config.annotation.web.configurers.SessionManagementConfigurer<HttpSecurity> sessionManagementConfigurer) {
        //             sessionManagementConfigurer.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        //         }
        //     });
        //     return http.build();
    // }

    // in this we are managing the user credentials hard coded
    // @Bean
    // public UserDetailsService userDetailsService(){
    //     UserDetails user1 = User
    //             .withDefaultPasswordEncoder()
    //             .username("kiran")
    //             .password("kiran@123")
    //             .roles("USER")
    //             .build();

    //     UserDetails user2 = User
    //             .withDefaultPasswordEncoder()
    //             .username("sumant")
    //             .password("sumant@123")
    //             .roles("ADMIN")
    //             .build();
    //     return new InMemoryUserDetailsManager(user1,user2);
    //     // from the given above . the username and password given in application.properties will not be used and this details will be used.
    // }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        provider.setUserDetailsService(userDetailsService);
        return provider;
    }
    
}
