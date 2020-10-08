package edu.wctc.instructions.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Bean
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.jdbcAuthentication().dataSource(dataSource);
    }


    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("/","/h2-console").permitAll()
                .antMatchers("/benefits").hasAuthority("employee")
                .antMatchers("/benefits").hasAuthority("major")
                .antMatchers("/chicken").hasAuthority("major")
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").permitAll()
                .and()
                .logout().permitAll();


    }
    public void configure(WebSecurity webSecurity) throws Exception{
        webSecurity.ignoring().antMatchers("/img/**","/style/**","h2-console/**");
    }
}
