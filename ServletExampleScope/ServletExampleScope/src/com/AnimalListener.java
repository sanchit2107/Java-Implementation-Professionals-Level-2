package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class AnimalListener
 *
 */
public class AnimalListener implements ServletContextListener {

    
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	System.out.println("Context Destroyed!!!!!!!!!!!!!!!!!!!!!!");
    }
    public void contextInitialized(ServletContextEvent evt)  { 
    	System.out.println("Context Initialized!!!!!!!!!!!!!!!!!!!!!!");
         ServletContext ctx=evt.getServletContext();
         Animal obj=new Animal();
         obj.setName("Lion");
         obj.setAge(14);
         ctx.setAttribute("animals", obj);
    }
	
}
