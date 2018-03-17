package odl_web_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.douillet.odl_service_core.UserDetailsServiceImp;


@Configuration
@EnableWebSecurity

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	 @Bean
	  public UserDetailsService userDetailsService() {
		  return new UserDetailsServiceImp();
	  };
	  
	  @Bean
	  public BCryptPasswordEncoder passwordEncoder() {
		  return new BCryptPasswordEncoder();
	  }
	  
	  @Override
	  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		  auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
	  }

	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
		  http.authorizeRequests().anyRequest().hasAnyRole("ADMIN", "USER")
		    .and()
		    .authorizeRequests().antMatchers("/login**").permitAll()
		    .and()
		    .formLogin().loginPage("/login").permitAll()
		    .and()
		    .logout().logoutSuccessUrl("/login").permitAll()
		    .and()
		    .csrf().disable();
	  }
}
