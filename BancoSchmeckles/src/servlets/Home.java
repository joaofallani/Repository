package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Home.do")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Home() {
        super();        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");  
        PrintWriter saida = response.getWriter();  
   
          
        HttpSession sessao=request.getSession();  
        
        String conta =(String)sessao.getAttribute("conta");

        
        if(conta == null){ 
        	saida.print("Por favor faça Login antes");
        	saida.println(" <a href='login.html'>Login</a>");
            }  
            else{              	
            	saida.print("Conta: " + conta);
            	saida.println(" <a href='Logoff.do'>Sair</a>");
                 }         
        saida.close();  
    }  	
}
