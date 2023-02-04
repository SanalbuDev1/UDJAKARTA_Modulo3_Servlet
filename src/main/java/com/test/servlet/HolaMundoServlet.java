package com.test.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

@WebServlet("/holaMundo")
public class HolaMundoServlet extends HttpServlet {

    Logger log = Logger.getLogger(HolaMundoServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException{

        log.info("Se inicia el servlet");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("    <head>");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title>Hola Mundo Servlet</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <h1>Hola Mundo Servlet 2!</h1>");
        out.println("    </body>");
        out.println("</html>");
        log.log(INFO,"Body ${0}", out);
        out.close();


    }
}
