package com.yarkopro.samplewebapp;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableJpaRepositories("com.yarkopro.samplewebapp.*")
@EntityScan("com.yarkopro.samplewebapp.*")
@ComponentScan("com.yarkopro.samplewebapp.*")
public class DBConfig {

    public static final String MYSQL_USER = "MYSQL_USER";
    public static final String MYSQL_PASSWORD = "MYSQL_PASSWORD";
    public static final String MYSQL_DATABASE = "MYSQL_DATABASE";
    public static final String MYSQL_HOST = "MYSQL_HOST";

    @Bean
    DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        String mySqlHost = "jdbc:mysql://" + System.getenv(MYSQL_HOST) + ":3306/" + System.getenv(MYSQL_DATABASE);
        ds.setUsername(System.getenv(MYSQL_USER));
        ds.setPassword(System.getenv(MYSQL_PASSWORD));
        ds.setUrl(mySqlHost);
        return ds;
    }

    @Bean
    @DependsOn("flyway")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource());
        entityManagerFactory.setPackagesToScan("com.yarkopro.samplewebapp.*");
        entityManagerFactory.setPersistenceProviderClass(HibernatePersistenceProvider.class);

        Properties props = new Properties();
        props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        entityManagerFactory.setJpaProperties(props);

        return entityManagerFactory;
    }
}
