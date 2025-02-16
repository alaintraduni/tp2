package com.example.tp2;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "maservlet", value = "/maservlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><meta charset='UTF-8'></head>");
        out.println("<body>");
        out.println("<h1>Bonjour Alain Trad</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
    }
}