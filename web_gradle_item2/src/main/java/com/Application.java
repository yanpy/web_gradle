package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Created by ljc on 2015/8/10.
 */
@SpringBootApplication
@ImportResource({"classpath*:spring/spring.xml"})
//@EnableCaching
//@EnableRabbit
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    /**
     * Declare bean: Encoding filter
     */
    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        final CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return characterEncodingFilter;
    }

//    @Bean
//    public ServletRegistrationBean dispatcherServletRegistration() {
//        ServletRegistrationBean registration = new ServletRegistrationBean(new DispatcherServlet());
//        Map<String,String> params = new HashMap<String,String>();
//        params.put("contextConfigLocation", "classpath:spring/mvc.xml");
//        registration.setInitParameters(params);
//        return registration;
//    }

    /**
     * Spring bootRun main function
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
