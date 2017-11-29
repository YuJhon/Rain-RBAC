package com.jhon.rain.config;

import com.alibaba.druid.support.http.WebStatFilter;
import com.jhon.rain.filter.LoginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jiangy19 on 2017/11/29.
 */
@Configuration
public class RbacFilterConfiguration {

  @Bean
  public FilterRegistrationBean loginFilter() {
    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new LoginFilter());
    /** 添加过滤规则 **/
    filterRegistrationBean.addUrlPatterns("/sys/*");
    return filterRegistrationBean;
  }

}
