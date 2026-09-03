package com.example.servlets;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Expedition")
public class ExpeditionsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void init(ServletConfig config) throws ServletException {
        expeditionsService = Application.getContext()
                .getBean("expeditionsService", ExpeditionsService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Expedition registred<h1>");

        resp.getWriter().println("<ul>");
        for (Expedition expedition : expeditionsService.getExpeditions()) {
            resp.getWriter().println("<li>" + expedition + "</li>");
        }
        resp.getWriter().println("</ul>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = req.getParameter("id");
        String name = req.getParameter("name");
        String code = req.getParameter("code");
        String region = req.getParameter("region");
        String baseCamp = req.getParameter("baseCamp");
        String leader = req.getParameter("leader");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        String state = req.getParameter("state");
        System.out.println("doPost: " + id + " - " + name);

        Course course = new Course(id, name, professorName, schedule);
        courseService.addCourse(course);
        resp.getWriter().println("Curso registrado: " + course);
    }
}
