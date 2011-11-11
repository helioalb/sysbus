package servlets;

import DAO.CarroDAO;
import DAO.LinhaDAO;
import beans.Carro;
import beans.Linha;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CarroServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CarroServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CarroServlet at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
             */
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Linha> linhas = new ArrayList<Linha>();
        
        LinhaDAO linhaDAO = new LinhaDAO();
        
        linhas = linhaDAO.selectAll();

        request.setAttribute("Linhas", linhas);
        
        request.getRequestDispatcher("/carro.jsp").forward(request, response);
        
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        Carro carro = new Carro();
        
        carro.setCodigoCarro(Integer.parseInt(request.getParameter("codigoCarro")));
        carro.setNumeroDePassageiros(Integer.parseInt(request.getParameter("numeroDePassageiros")));
        carro.setLinhaCarro(Integer.parseInt(request.getParameter("linhaCarro")));
        
        CarroDAO carroDAO = new CarroDAO();
        
        carroDAO.insert(carro);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
