package com.paintshopping.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@EnableConfigurationProperties
@MapperScan("com.paintshopping.core.mapper")
@ComponentScan({"com.paintshopping.core.service", "com.paintshopping.api.service", "com.paintshopping.core.util", "com.paintshopping.apis.dto"})
public class PaintShoppingConfigure extends WebMvcConfigurerAdapter {
	
	 @Bean
	    public DriverManagerDataSource dataSource() throws IOException {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        Properties properties = new Properties();
	        InputStream user_props = this.getClass()
	                .getResourceAsStream("/application.properties");
	        properties.load(user_props);
	        dataSource.setDriverClassName(
	                properties.getProperty("spring.datasource.driver-class-name"));
	        dataSource.setUrl(properties.getProperty("spring.datasource.url"));
	        dataSource.setUsername(
	                properties.getProperty("spring.datasource.username"));
	        dataSource.setPassword(
	                properties.getProperty("spring.datasource.password"));
	        return dataSource;
	    }

	@Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        Resource resource = new ClassPathResource("mybatis-config.xml");
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        sqlSessionFactory.setConfigLocation(resource);
        return sqlSessionFactory;
    }
	
	@Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.paintshopping.core.mapper");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }


}
