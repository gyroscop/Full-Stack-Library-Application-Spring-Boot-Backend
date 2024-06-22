//package com.library.springbootlibrary.config;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class FilterConfiguration {
//
//    @Bean
//    public FilterRegistrationBean<CustomCSPFilter> cspFilter() {
//        FilterRegistrationBean<CustomCSPFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new CustomCSPFilter());
//        registrationBean.addUrlPatterns("/*");
//        return registrationBean;
//    }
//
//    public class CustomCSPFilter extends HttpFilter {
//        @Override
//        public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
//                throws IOException, ServletException {
//            response.setHeader("Content-Security-Policy", "default-src 'none'; img-src 'self' data: blob:; worker-src 'self' blob:;");
//            chain.doFilter(request, response);
//        }
//
//        @Override
//        public void init(FilterConfig filterConfig) throws ServletException {
//            // Initialization code if needed
//        }
//
//        @Override
//        public void destroy() {
//            // Cleanup code if needed
//        }
//    }
//}
