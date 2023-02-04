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

@WebServlet("/parametros-get/url-get")
public class ParametroGetServlet extends HttpServlet {

    Logger log = Logger.getLogger(ParametroGetServlet.class.getName());


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
                PrintWriter out = resp.getWriter();

                String saludo = req.getParameter("saludo");
                String nombre = req.getParameter("nombre");
                Integer edad = Integer.valueOf(req.getParameter("edad"));

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("    <head>");
                out.println("        <meta charset=\"UTF-8\">");
                out.println("        <title>Parametro get de la url</title>");
                out.println("    </head>");
                out.println("    <body>");
                out.println("        <h1>Parametro get de la url</h1>");
                out.println("        <h2>"+saludo + ' ' +nombre+ ' ' + edad+"</h2>");
                out.println("    </body>");
                out.println("</html>");
                log.log(INFO,"Body ${0}", saludo);
                out.close();
    }
}
