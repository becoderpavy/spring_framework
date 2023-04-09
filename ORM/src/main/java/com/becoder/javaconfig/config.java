package com.becoder.javaconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class config {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_orm");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean getFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

		factoryBean.setDataSource(getDataSource());

		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
		properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));

		factoryBean.setHibernateProperties(properties);
		factoryBean.setAnnotatedPackages("com.becoder.model");

		return factoryBean;

	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager trans = new HibernateTransactionManager();
		trans.setSessionFactory(getFactory().getObject());

		return trans;
	}
	
	/*
	 * public HibernateTemplate hiberTemplate() { HibernateTemplate temp=new
	 * HibernateTemplate();
	 * 
	 * }
	 */
}
