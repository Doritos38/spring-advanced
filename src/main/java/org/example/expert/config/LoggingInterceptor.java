package org.example.expert.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.example.expert.domain.user.enums.UserRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
@RequiredArgsConstructor
public class LoggingInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        UserRole userRole = UserRole.valueOf(request.getAttribute("userRole").toString());
        if (!UserRole.ADMIN.equals(userRole)) {
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            return false;
        }

        logger.atInfo().log("requestTime : "+ System.currentTimeMillis());
        logger.atInfo().log("requestUrl : "+ request.getRequestURL());

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
