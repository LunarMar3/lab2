package org.database.lab2.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


@Component
public class RoleInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取当前用户的角色，从session或token中获取
        String role = (String) request.getSession().getAttribute("role");

        String requestURI = request.getRequestURI();

        // 根据请求的URI和用户角色判断是否有权限访问
        if (requestURI.contains("studentforad.html") && !"1".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("studentforst.html") && !"2".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("studentforte.html") && !"3".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("courseforad.html") && !"1".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("courseforst.html") && !"2".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("courseforte.html") && !"3".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("coursechoosingforad.html") && !"1".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("coursechoosingforst.html") && !"2".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("coursechoosingforte.html") && !"3".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("averageforad.html") && !"1".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("averageforst.html") && !"2".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("averageforte.html") && !"3".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("gradeforad.html") && !"1".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("gradeforst.html") && !"2".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("gradeforte.html") && !"3".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("teacherforad.html") && !"1".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("teacherforst.html") && !"2".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        } else if (requestURI.contains("teacherforte.html") && !"3".equals(role)) {
            response.sendRedirect("/error/403.html");
            return false;
        }

        return true;
    }
}
