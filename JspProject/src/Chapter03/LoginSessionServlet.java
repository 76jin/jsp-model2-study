package Chapter03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginSessionServlet
 */
@WebServlet("/loginSession")
public class LoginSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8"); // post 한글 처리.
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
	    
	    String id = request.getParameter("id");
	    String passwd = request.getParameter("passwd");
	    if (id.equals("java") && passwd.equals("java")) {
	        HttpSession session = request.getSession();
	        session.setAttribute("id", id);
	        RequestDispatcher dispatcher =
	                request.getRequestDispatcher("loginSuccess.jsp");
	        dispatcher.forward(request, response);
	    } else {
	        out.println("<script>");
	        out.println("alert('아이디나 비밀번호가 일치하지 않습니다!')");
	        out.println("history.back()");
	        out.println("</script>");
	    }
	}

}
