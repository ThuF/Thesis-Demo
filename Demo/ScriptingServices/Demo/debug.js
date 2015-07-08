var a = 1;

var b = 5;

var c = 10;

var d = a + b + c;

var message = "Hello World " + d;

response.setContentType("text/html");
response.getWriter().println(message);
response.getWriter().flush();
response.getWriter().close();
