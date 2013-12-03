import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.tag.common.fmt.ParseDateSupport;


public class BisiestoServlet extends HttpServlet  {
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		    String anio = request.getParameter("anio");
			Bisiesto bs = new Bisiesto();
			response.getWriter().println(bs.Mostrar(Integer.parseInt(anio)));
	}	

}
