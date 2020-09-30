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
import java.util.List;

@WebServlet(name = "ListCandidateServlet", urlPatterns = "/listCandidates")
public class ListCandidateServlet extends HttpServlet {
    CandidateService service = new CandidateServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Candidate> candidates = service.findAll();
        request.setAttribute("candidates", candidates);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/listCandidates.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
