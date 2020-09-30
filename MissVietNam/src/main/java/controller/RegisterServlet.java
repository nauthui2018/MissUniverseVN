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

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    CandidateService service = new CandidateServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String dob = request.getParameter("dob");
        String address1 = request.getParameter("address1");
        String address2 = request.getParameter("address2");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String personalCode  = request.getParameter("personalCode");
        String job = request.getParameter("job");
        String education = request.getParameter("education");
        String ethnic = request.getParameter("ethnic");
        String address3 = request.getParameter("address3");
        double height = Double.parseDouble(request.getParameter("height"));
        double weight = Double.parseDouble(request.getParameter("weight"));
        String talent  = request.getParameter("talent");
        String image = request.getParameter("image");
        int code = Integer.parseInt(request.getParameter("code"));
        Candidate candidate = new Candidate(name, dob, address1, address2, mobile, email, personalCode, job, education, ethnic, address3, height, weight, talent, image, code);
        this.service.create(candidate);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/registerForm.jsp");
        request.setAttribute("message", "New candidate had been registered");
        try {
            dispatcher.forward(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/registerForm.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
