//package com.qualwalk.monolith.web.filter;
//
//import lombok.extern.slf4j.Slf4j;
//import org.keycloak.KeycloakPrincipal;
//import org.keycloak.KeycloakSecurityContext;
//import org.keycloak.representations.AccessToken;
////import org.springframework.security.core.Authentication;
////import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.ServletWebRequest;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Map;
//import java.util.Objects;
//
//@Slf4j
//@Component
//public class OrganizationExtractionFilter extends OncePerRequestFilter {
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        log.info("INSIDE CUSTOM FILTER");
////        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
////        if (Objects.nonNull(authentication) && authentication.getPrincipal() instanceof KeycloakPrincipal) {
////            KeycloakPrincipal<KeycloakSecurityContext> principal = (KeycloakPrincipal<KeycloakSecurityContext>) authentication
////                    .getPrincipal();
////            AccessToken token = principal.getKeycloakSecurityContext().getToken();
////            Map<String, Object> otherClaims = token.getOtherClaims();
////            ServletWebRequest servletWebRequest = new ServletWebRequest(request, response);
////            servletWebRequest.setAttribute(
////                    "organization",
////                    otherClaims.getOrDefault("organization", ""),
////                    RequestAttributes.SCOPE_REQUEST
////            );
////            filterChain.doFilter(servletWebRequest.getRequest(), response);
//
////        }
////        filterChain.doFilter(request, response);
//    }
//}
