package odl_web_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.douillet.odl_service_core.UserDetailsServiceImp;

import odl_web_security.RestUnauthorizedEntryPoint;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@ComponentScan(basePackages = { "odl_web_security" })
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		return new UserDetailsServiceImp();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Autowired
	private AuthenticationFailureHandler restAuthenticationFailureHandler;

	@Autowired
	private AuthenticationSuccessHandler restAuthenticationSuccessHandler;

	@Autowired
	private RestUnauthorizedEntryPoint restAuthenticationEntryPoint;

	@Autowired
	private AccessDeniedHandler restAccessDeniedHandler;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService());
	}
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests().anyRequest().hasAnyRole("ADMIN", "USER") .and()
	 * .authorizeRequests().antMatchers("resources/**","/css/**").permitAll() .and()
	 * .csrf().disable();
	 * 
	 * http .authorizeRequests() .antMatchers("/resources/**").permitAll()
	 * .anyRequest().authenticated() .and() .formLogin() .loginPage("/login")
	 * .usernameParameter("username") .passwordParameter("password") .permitAll()
	 * .and() .logout() .permitAll().and() .csrf().disable();
	 * 
	 * 
	 * }
	 */

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		http.addFilterBefore(filter, CsrfFilter.class);

		http.authorizeRequests().anyRequest().permitAll().and().authorizeRequests()
				.antMatchers("resources/**", "/css/**").permitAll().and().csrf().disable()
				.addFilterBefore(filter, CsrfFilter.class);

		http.addFilterBefore(filter, CsrfFilter.class).headers().disable().csrf().disable().authorizeRequests()
				// .antMatchers("/v2/api-docs").hasAnyAuthority("admin")
				// .antMatchers("/users/**").hasAnyAuthority("admin")
				.anyRequest().authenticated().and().exceptionHandling()
				.authenticationEntryPoint(restAuthenticationEntryPoint).accessDeniedHandler(restAccessDeniedHandler)
				.and().formLogin().loginProcessingUrl("/login").loginPage("/index.html").permitAll()
				.successHandler(restAuthenticationSuccessHandler).failureHandler(restAuthenticationFailureHandler)
				.usernameParameter("username").passwordParameter("password").permitAll().and().logout()
				.logoutUrl("/logout").logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler())
				.deleteCookies("JSESSIONID").permitAll();
		// .and()
		// .rememberMe()
		// .rememberMeServices(rememberMeServices)
		// .key(REMEMBER_ME_KEY)
		// .and();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/index", "/partials/**", "/", "/error/**", "/getSession");
	}
}
