package com.example.discountcalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));

        float discountAmount = price * discount * 0.01f;
        float discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        writer.println("<html>");
        writer.println("San pham ban chon la:  " + product +"</br>");
        writer.println("Gia niem yet san pham:  " + numberFormat.format(price)+" VND"+"</br>");
        writer.println("So tien ban duoc triet khau: " + numberFormat.format(discountAmount) +" VND"+ "</br>");
        writer.println("Gia san pham sau khi giam: "+ numberFormat.format(discountPrice)+" VND");
        writer.println("</html>");


    }
}