package com.SpringBootCrud.JavaMentor.security;

import java.io.IOException;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class SimpleAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException  {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        if (roles.contains("ROLE_ADMIN") && roles.contains("ROLE_USER")) {
            response.sendRedirect("/admin");
        } else if (roles.contains("ROLE_ADMIN")) {
            response.sendRedirect("/admin");
        } else if (roles.contains("ROLE_USER")) {
            response.sendRedirect("/user");
        }
    }
}
