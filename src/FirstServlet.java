import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class FirstServlet extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        System.out.println("servlet 初始化");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        System.out.println("哈哈哈");
        String name = req.getParameter("name");
        String url = req.getParameter("url");
        String city = req.getParameter("city");
        String sex = req.getParameter("sex");
        String[] web = req.getParameterValues("web");
        Enumeration<String> enumeration = req.getParameterNames();
        while (enumeration.hasMoreElements()) {
            System.out.println("===" + enumeration.nextElement());
        }
        System.out.println("name:" + name + "-----" + "url:" + url + "---city:" + city + "----sex:" + sex + "----web:" + web);
        writer.write("<h1>" + name+url+ "</h1>");
        Cookie[] cookies = req.getCookies();
        HttpSession session = req.getSession();
        String ctx = req.getContextPath(); //返回指示请求上下文的请求 URI 部分。
        String gqs = req.getQueryString(); //返回包含在路径后的请求 URL 中的查询字符串。
        String charEnc = req.getCharacterEncoding(); //null
        String sp = req.getServletPath();   ///FirstServlet
        Enumeration enume = req.getHeaderNames();
//        while (enume.hasMoreElements()) {
//            System.out.println("头:" + enume.nextElement() + "值:" + req.getHeader(enume.nextElement().toString()));
//        }

        Cookie cookie = new Cookie("hello", "你好");
        resp.addCookie(cookie);
//        destroy();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("servlet 销毁了");
        super.destroy();
    }
}
