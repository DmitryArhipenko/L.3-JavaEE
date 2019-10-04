package hometask;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Questionary extends HttpServlet {

    private static final String TEMPLATE = "<!DOCTYPE html><html lang = \"en\">" +
            "<head><title>Prog.kiev.ua</title></head>" +
            "<body><h1>%s</h1></body></html>";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");

        //Получаем значения из форм ввода. и преобразуем в нужный тип по необходимости
        //req это данные с запроса Post которые мы получаем(к нам приходят)
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        Integer age = null;
        try {
            age = Integer.parseInt(req.getParameter("age"));
        } catch (NumberFormatException e) {
            age = 0;
        }

        Profile profile = new Profile(name,surname,email,age);
        resp.getWriter().println(String.format(TEMPLATE, profile));
        }
    }