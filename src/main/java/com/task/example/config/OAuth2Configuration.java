//package com.task.example.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.HttpStatusEntryPoint;
//
//
//@EnableOAuth2Sso
//@Configuration
//public class OAuth2Configuration extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//
////        http
////                .antMatcher("/**")
////                .authorizeRequests()
////                .antMatchers("/","/login**")
////                .permitAll()
////                .anyRequest()
////                .authenticated();
//        http
//                .authorizeRequests(a->a
//                .antMatchers("/**","/login**", "/h2","/list","/error","/webjars/**").permitAll()
//                .anyRequest().authenticated()
//                )
////                .logout(l->l
////                        .logoutSuccessUrl("/").permitAll())
//                .exceptionHandling(e-> e
//                    .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED)))
//                .oauth2Login();
//
//    }
//}
//
