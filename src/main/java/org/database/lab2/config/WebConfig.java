package org.database.lab2.config;

import org.database.lab2.interceptor.RoleInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private RoleInterceptor roleInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(roleInterceptor)
                .addPathPatterns("/**", "**") // 拦截所有请求
                .excludePathPatterns("/pages/login", "/error"); // 排除登录和错误页面
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("forward:/pages/login.html");
        registry.addViewController("/averageforad").setViewName("forward:/pages/averageforad.html");
        registry.addViewController("/averageforst").setViewName("forward:/pages/averageforst.html");
        registry.addViewController("/averageforte").setViewName("forward:/pages/averageforte.html");
        registry.addViewController("/coursechoosingforad").setViewName("forward:/pages/coursechoosingforad.html");
        registry.addViewController("/coursechoosingforst").setViewName("forward:/pages/coursechoosingforst.html");
        registry.addViewController("/coursechoosingforte").setViewName("forward:/pages/coursechoosingforte.html");
        registry.addViewController("/courseforad").setViewName("forward:/pages/courseforad.html");
        registry.addViewController("/courseforst").setViewName("forward:/pages/courseforst.html");
        registry.addViewController("/courseforte").setViewName("forward:/pages/courseforte.html");
        registry.addViewController("/gradeforad").setViewName("forward:/pages/gradeforad.html");
        registry.addViewController("/gradeforst").setViewName("forward:/pages/gradeforst.html");
        registry.addViewController("/gradeforte").setViewName("forward:/pages/gradeforte.html");
        registry.addViewController("/studentforad").setViewName("forward:/pages/studentforad.html");
        registry.addViewController("/studentforst").setViewName("forward:/pages/studentforst.html");
        registry.addViewController("/studentforte").setViewName("forward:/pages/studentforte.html");
        registry.addViewController("/teacherforad").setViewName("forward:/pages/teacherforad.html");
        registry.addViewController("/teacherforst").setViewName("forward:/pages/teacherforst.html");
        registry.addViewController("/teacherforte").setViewName("forward:/pages/teacherforte.html");
    }
}
