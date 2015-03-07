package Chapter03;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HangulServlet
 */
@WebServlet("/hangul")
public class HangulServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HangulServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	    request.setCharacterEncoding("utf-8");
	    String name = request.getParameter("name");
//	    String korName = HangulUtil.toKor(name);
	    String korName = name;
	    
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
	    out.println("original = " + name);
	    out.println("hangul Process = " + korName);
	    out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    req.setCharacterEncoding("utf-8");
	    String name = req.getParameter("name");
	    
	    resp.setContentType("text/html;charset=utf-8");
	    PrintWriter out = resp.getWriter();
	    out.println("hangul Process = " + name);
	}

}
