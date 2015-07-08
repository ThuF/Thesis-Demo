package Demo;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld {

    public void service(HttpServletRequest request, HttpServletResponse response, Map<String, Object> scope) throws Exception {
        response.setContentType("text/html");
        response.getWriter().println("Hello World TU!");
        response.getWriter().flush();
        response.getWriter().close();
    }
}
