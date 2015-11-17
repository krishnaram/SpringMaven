package com.mindfiresolutions.springmaven.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

 

@Configuration
@ComponentScan(basePackages={"com.mindfiresolutions.springmaven.service","com.mindfiresolutions.springmaven.config"})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="com.mindfiresolutions.springmaven.repo",entityManagerFactoryRef="entityManager")
public class ApplicationConfig {
	@Bean(name="datasource")
	  public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3308/tms");
		dataSource.setUsername("root");
		dataSource.setPassword("mindfire");
		return dataSource;
	  }
	

	/**
	 * @return bean of entity manager
	 */
	@Bean (name="entityManager")
	   public EntityManagerFactory entityManagerFactory() {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	    vendorAdapter.setGenerateDdl(true);
	    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
	    factory.setJpaVendorAdapter(vendorAdapter);
	    factory.setPackagesToScan("com.mindfiresolutions.springmaven.models");
	    factory.setDataSource(dataSource());
	    factory.setJpaProperties(getJpaProperties());
	    factory.afterPropertiesSet();
	    return factory.getObject();
	      
	   }
	  
	  
	/**
	 * @return Properties used to initialize entityManager Bean
	 */
	private Properties getJpaProperties() {
			Properties properties = new Properties();
			properties.put("hibernate.show_sql", "true");
			properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
			properties.put("hibernate.hbm2ddl.auto", "validate");
			return properties;
		}
	
	 @Bean
	   public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
	      return new PersistenceExceptionTranslationPostProcessor();
	   }

    /**
	 * @return a bean of transaction manager
	 */
	
	 @Bean
	  public PlatformTransactionManager transactionManager() {
	    JpaTransactionManager txManager = new JpaTransactionManager();
	    txManager.setEntityManagerFactory(entityManagerFactory());
	    return txManager;
	  }
	
	
}
