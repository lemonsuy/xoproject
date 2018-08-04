/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myXoServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import myXOpackage.XOgame;

/**
 *
 * @author user
 */
public class inputServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String position0 = request.getParameter("R1_C1");
        String position1 = request.getParameter("R1_C2");
        String position2 = request.getParameter("R1_C3");
        String position3 = request.getParameter("R2_C1");
        String position4 = request.getParameter("R2_C2");
        String position5 = request.getParameter("R2_C3");
        String position6 = request.getParameter("R3_C1");
        String position7 = request.getParameter("R3_C2");
        String position8 = request.getParameter("R3_C3");

        HttpSession session = request.getSession(true);
        XOgame xoGame = new XOgame();
        xoGame.StartGame();
//        session.setAttribute("Player1", xoGame.getPlayer1());
        System.out.println("do it?"+ xoGame.getPlayer1());
        request.setAttribute("player1", xoGame.getPlayer1());
        request.setAttribute("player2", xoGame.getPlayer2());
        request.setAttribute("tie", xoGame.getTie());
        request.setAttribute("turn", xoGame.getTurn());
//        System.out.println(position);
        getServletContext().getRequestDispatcher("/gameXO.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
