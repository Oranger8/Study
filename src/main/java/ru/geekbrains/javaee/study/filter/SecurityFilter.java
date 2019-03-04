package ru.geekbrains.javaee.study.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = "/secure/*")
public class SecurityFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession(false);

        if (httpRequest.getServletPath().equals("/cart")) {
            if (session == null) {
                httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
            } else {
                String user = (String) session.getAttribute("user");

                httpResponse.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");
                httpResponse.getWriter().println("<p>User " + user + " is logged in. <a href=\"logout\">Logout</a></p>");
            }
        }

        chain.doFilter(request, response);
    }

    private String getCookie(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) return null;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(name)) return cookie.getValue();
        }
        return null;
    }

    @Override
    public void destroy() {

    }
}