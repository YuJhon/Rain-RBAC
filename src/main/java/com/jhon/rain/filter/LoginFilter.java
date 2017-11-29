package com.jhon.rain.filter;

import com.jhon.rain.entity.SysUser;
import com.jhon.rain.helper.RequestHolder;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>功能描述</br> 登录过滤器 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName LoginFilter
 * @date 2017/11/18 11:03
 */
@Slf4j
public class LoginFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) servletRequest;
    HttpServletResponse resp = (HttpServletResponse) servletResponse;

    SysUser sysUser = (SysUser) req.getSession().getAttribute("user");
    if (sysUser == null) {
      String path = "/";
      resp.sendRedirect(path);
      return;
    }
    RequestHolder.add(sysUser);
    RequestHolder.add(req);
    filterChain.doFilter(servletRequest, servletResponse);
    return;
  }

  @Override
  public void destroy() {

  }
}
