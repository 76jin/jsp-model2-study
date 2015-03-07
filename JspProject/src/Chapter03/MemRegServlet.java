package Chapter03;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemRegServlet
 */
@WebServlet("/memReg")
public class MemRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemRegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    /*
	회원명: <input type="text" name="name" ><br>
    주소: <input type="text" name="addr"><br>
    전화번호: <input type="text" name="tel"><br>
    취미: <input type="text" name="hobby"><br>
	     */
	    String name = request.getParameter("name");
	    String addr = request.getParameter("addr");
	    String tel = request.getParameter("tel");
	    String hobby = request.getParameter("hobby");
	    
	    response.setContentType("text/html;charset=euc-kr");
	    PrintWriter out = response.getWriter();
	    out.println("이름=" + name + "<br>");
	    out.println("주소=" + addr + "<br>");
	    out.println("전화번호=" + tel + "<br>");
	    out.println("취미=" + hobby + "<br>");
	    out.close();
	}

}
