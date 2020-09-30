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

@WebServlet(name = "DeleteServlet", urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    CandidateService service = new CandidateServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String personalCode = request.getParameter("personalCode");
        Candidate candidate = this.service.findByID(personalCode);
        RequestDispatcher dispatcher;
        if(candidate == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            this.service.delete(candidate);
            request.setAttribute("message", "Candidate's" + candidate.getName() + "was deleted");
            try {
                response.sendRedirect("/view/listCandidates.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String personalCode = request.getParameter("personalCode");
        Candidate candidate = this.service.findByID(personalCode);
        RequestDispatcher dispatcher;
        if(candidate == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("candidate", candidate);
            dispatcher = request.getRequestDispatcher("view/deleteForm.jsp");
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
