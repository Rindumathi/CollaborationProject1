package com.niit.CollaborationBackend.DBconfig;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import com.niit.CollaborationBackend.Dao.BlogDao;
import com.niit.CollaborationBackend.DaoImpl.BlogDaoImpl;

public class DBconfig 
{
	@Bean
public DataSource getOracleDataSource()
{
	DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
	driverManagerDataSource.setDriverClassName("oracle.jdbc.driver.oracleDriver");
	driverManagerDataSource.setUrl("");
	driverManagerDataSource.setUsername("indu");
	driverManagerDataSource.setPassword("indu");
	return driverManagerDataSource;
	
}
 public Properties getHibernateProperties()
 {
	 Properties properties = new Properties();
	 properties.setProperty("hibernate.hbm2ddl.auto","update");
	 properties.put("hibernate.dialect","org.hibernate.dialect.oracle 10g Dialect");
	 return properties;
 }

 @Bean
 public SessionFactory getSessionFactory()
 {
	 LocalSessionFactoryBuilder localSessionFactoryBuilder = new LocalSessionFactoryBuilder(getOracleDataSource());
	 localSessionFactoryBuilder.addProperties(getHibernateProperties());
	 System.out.println("SessionFactory beans created");
	 return localSessionFactoryBuilder.buildSessionFactory();
 }
 
 @Bean
 public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
 {
	 return new HibernateTransactionManager(sessionFactory);
 }
  
 @Bean
 public BlogDao getBlogDao(SessionFactory sessionFactory)
 {
	 return new BlogDaoImpl(sessionFactory);
 }
}
