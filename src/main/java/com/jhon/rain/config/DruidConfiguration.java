package com.jhon.rain.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * <p>功能描述</br> Druid数据源的配置 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName DruidConfiguration
 * @date 2017/11/16 11:31
 */
@Configuration
public class DruidConfiguration {

	@Bean
	public ServletRegistrationBean statViewServlet() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
		/** 白名单 **/
		servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
		/** IP黑名单 **/
		servletRegistrationBean.addInitParameter("deny", "192.168.1.244");
		/** 登录查看信息的账号密码 **/
		servletRegistrationBean.addInitParameter("loginUsername", "jhonrain");
		servletRegistrationBean.addInitParameter("loginPassword", "jhonrain1321");
		/** 是否能够重置数据 **/
		servletRegistrationBean.addInitParameter("resetEnable", "false");
		return servletRegistrationBean;
	}

	@Bean
	public FilterRegistrationBean statFilter() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
		/** 添加过滤规则 **/
		filterRegistrationBean.addUrlPatterns("/*");
		/** 添加不需要忽略的格式信息 **/
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		return filterRegistrationBean;
	}

	@Bean
	PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean(name = "datasource")
	@Primary  // 该Bean优先被注入
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(@Qualifier("datasource") DataSource dataSource) throws IOException {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));
		return sqlSessionFactoryBean;
	}
}
