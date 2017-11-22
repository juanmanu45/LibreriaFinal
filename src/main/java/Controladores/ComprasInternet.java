/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.CrudLibro;
import DAO.Online;
import VO.ComprasOnline;

import VO.Libro;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Manuel
 */
public class ComprasInternet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            RequestDispatcher rq = request.getRequestDispatcher("nuevasCompras.jsp");

            CrudLibro cru = new CrudLibro();

            ArrayList<Libro> lis = null;
            lis = (ArrayList<Libro>) cru.listarLibros();
            if (lis.size() > 0) {

                request.setAttribute("lis", lis);
            } else {
                request.setAttribute("lis", null);
            }
            rq.forward(request, response);
        } catch (URISyntaxException ex) {
            Logger.getLogger(CrearFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.sendRedirect("nuevasCompras.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean resultado = false;

        String id = request.getParameter("id");
        String libro1 = request.getParameter("libro1");
        String tarjeta = request.getParameter("tarjeta");
        String cliente = request.getParameter("nombre");
        String libro2 = request.getParameter("libro2");
        String libro3 = request.getParameter("libro3");
        String libro4 = request.getParameter("libro4");

        int idCom = Integer.parseInt(id);
        int em = Integer.parseInt(tarjeta);

        if (id.trim().length() != 0 && libro1.trim().length() != 0) {

            try {

                Online on = new Online();
                CrudLibro cl = new CrudLibro();
                Libro li = new Libro();
                 li = cl.extraerLibro(libro1);
                 int id1 = li.getId();
                 int p1=li.getPrecio();
                 
                int id2=0;
                int id3=0;
                int id4=0;
                
                int p2=0;
                int p3=0;
                int p4=0;

                if (libro2.trim().length() == 0) {
                    libro2 = null;
                    id2=0;

                } else if (libro3.trim().length() == 0) {
                    libro3 = null;
                    id3=0;

                } else if (libro4.trim().length() == 0) {
                    libro4 = null;
                } else {

                   
                    p1 = li.getPrecio();
                    li = cl.extraerLibro(libro2);
                    id2 = li.getId();
                    p2 = li.getPrecio();
                    li = cl.extraerLibro(libro3);
                    p3 = li.getPrecio();
                    id3 = li.getId();
                    li = cl.extraerLibro(libro4);
                    id4 = li.getId();
                    p4 = li.getPrecio();

                }

                int ventaTotal = p1+p2+p3+p4;

                ComprasOnline c = new ComprasOnline(cliente, libro1, libro2, libro3, libro4, id1, id2, id3, id4, idCom, ventaTotal, em);

                on.facturar(c);

                RequestDispatcher rq = request.getRequestDispatcher("nuevasCompras.jsp");

                if (resultado == true) {
                    request.setAttribute("resultado", true);
                } else {
                    request.setAttribute("resultado", false);
                }

                rq.forward(request, response);
            } catch (URISyntaxException ex) {
                Logger.getLogger(CrearFactura.class.getName()).log(Level.SEVERE, null, ex);

            }

        }
    }

}
