package br.com.testeonline.session;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSessionEvent;

public class SessionListener {

	
	public void sessionCreated(HttpSessionEvent event) {
        System.out.println("Sess�o criada " + event.getSession().getId());
   }

   public void sessionDestroyed(HttpSessionEvent event) {
        String ultimoAcesso = (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(new Date(event.getSession().getLastAccessedTime()));
   }
   
}
