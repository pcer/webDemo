import javax.servlet.*;
import java.io.IOException;

/**
 * 过滤器的学习
 * 动态的拦截请求和响应
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {
        // 获取初始化参数
        String canshu = filterConfig.getInitParameter("canshu");
        System.out.println("初始化参数：" + canshu);
    }

    /**
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
        // 输出站点名称
        System.out.println("你访问我了，我是MyFilter");
        String name=servletRequest.getParameter("name");
        try {
//            if("hello".equals(name)){
                // 把请求传回过滤链
                System.out.println("访问成功");
                filterChain.doFilter(servletRequest, servletResponse);
//            }else {
//                System.out.println("出错啦");
//            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {

    }
}
