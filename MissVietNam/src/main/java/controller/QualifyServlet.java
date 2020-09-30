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

@WebServlet(name = "QualifyServlet", urlPatterns = "/qualify")
public class QualifyServlet extends HttpServlet {
    CandidateService service = new CandidateServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String personalCode = request.getParameter("personalCode");
        String qualify = request.getParameter("qualify");
        Candidate candidate = service.findByID(personalCode);
        RequestDispatcher dispatcher;
        if (candidate == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            candidate.setQualify(qualify);
            request.setAttribute("candidate", candidate);
            request.setAttribute("message", "Candidate's " + candidate.getName() + " was qualified");
            dispatcher = request.getRequestDispatcher("view/qualifyForm.jsp");
            response.sendRedirect("view/listCandidates.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String personalCode = request.getParameter("personalCode");
        Candidate candidate = service.findByID(personalCode);
        RequestDispatcher dispatcher;
        if(candidate == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("candidate", candidate);
            dispatcher = request.getRequestDispatcher("view/qualifyForm.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
