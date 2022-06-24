package com.belajar.auth.BelajarAuthJWT.config;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.*;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

public class JWTAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {
    public static final long serialVersionUID = -7858869558953243875L;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}
