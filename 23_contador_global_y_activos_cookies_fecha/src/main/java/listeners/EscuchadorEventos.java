package listeners;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class EscuchadorEventos implements ServletContextListener, HttpSessionListener {


 

    public void sessionCreated(HttpSessionEvent se)  { 
    	 //inicializar atributo de sesión contador
    	HttpSession sesion=se.getSession();
    	sesion.setAttribute("contador", 0);
    	
    	
    	ServletContext context=se.getSession().getServletContext();
    	int activos=(Integer)context.getAttribute("activos");
    	context.setAttribute("activos", ++activos);
    }


    public void sessionDestroyed(HttpSessionEvent se)  { 
    	ServletContext context=se.getSession().getServletContext();
    	int activos=(Integer)context.getAttribute("activos");
    	context.setAttribute("activos", --activos);
    	
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
        ServletContext context=sce.getServletContext();
        context.setAttribute("global", 0);
        context.setAttribute("activos", 0);
    }


    public void contextDestroyed(ServletContextEvent sce)  { 
         
    }
	
}
