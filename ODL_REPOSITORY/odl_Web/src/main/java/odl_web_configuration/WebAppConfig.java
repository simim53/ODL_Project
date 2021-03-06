package odl_web_configuration;

import odl_hibernate_model.Adresse;
import odl_hibernate_model.Utilisateur;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.Objects;
import java.util.Properties;

/**
 * @author sdouillet
 */

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = {
        "odl_hibernate_model",
        "com.douillet.odl_dao_core",
        "com.douillet.odl_dao_api",
        "com.douillet.odl_service_core",
        "com.douillet.odl_service_api",
        "odl_web_controllers",
        "odl_web_configuration",
        "odl_web_initializer",
        "odl_web_security"})

public class WebAppConfig {

    private final Environment env;

    @Autowired
    public WebAppConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public BasicDataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(env.getProperty("db.driver"));
        dataSource.setUrl(env.getProperty("db.url"));
        dataSource.setUsername(env.getProperty("db.username"));
        dataSource.setPassword(env.getProperty("db.password"));
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(getDataSource());

        Properties props = new Properties();
        props.put("hibernate.show_sql", Objects.requireNonNull(env.getProperty("hibernate.show_sql")));
        props.put("hibernate.hbm2ddl.auto", Objects.requireNonNull(env.getProperty("hibernate.hbm2ddl.auto")));
        props.put("hibernate.dialect", Objects.requireNonNull(env.getProperty("hibernate.dialect")));

        factoryBean.setHibernateProperties(props);
        factoryBean.setAnnotatedClasses(Utilisateur.class, Adresse.class);
        return factoryBean;
    }


    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }


    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".html");

        return viewResolver;
    }


}