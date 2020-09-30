package controller;

import model.entity.Candidate;
import model.service.BaseService;
import model.service.CandidateService;
import model.service.CandidateServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListQualifierServlet", urlPatterns = "/listQualifiers")
public class ListQualifierServlet extends HttpServlet {
    CandidateService service = new CandidateServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Candidate> candidates = this.service.findAll();
        List<Candidate> qualifiers = new ArrayList<>();
        for (Candidate item: candidates) {
            if (item.getQualify().equals("Qualified")) {
                qualifiers.add(item);
            }
        }
        request.setAttribute("qualifiers", qualifiers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/listQualifiers.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
