## Web Server Challenge

We are deploying code to extremely constrained IoT (Internet of Things) devices. 
We need a web dashboard, but the devices don't have enough memory to run Spring Boot or Tomcat.
We need to build a microscopic web server from scratch using nothing but the core Java language.

### Task

Use `java.net.ServerSocket to listen` for incoming connections, parse an incoming raw HTTP GET request, and return a 
valid HTTP response containing an HTML page.

#### Rules
Standard Library ONLY (`java.net.*` and `java.io.*`). No Spring, no Spark, no Apache HTTP Client. our server must run 
continuously (in a while(true) loop) and accept multiple requests without shutting down.

#### Technical Requirements:

- **Listen**: Open a ServerSocket on port 8080.

- **Read:** When a client connects (via server.accept()), read the InputStream. You will see the raw HTTP request sent 
by your browser (e.g., GET / HTTP/1.1...).

- **Route:** 
  - If the request is for / or /index.html, read the provided index.html file from disk. 
  - If the request is for anything else, prepare a 404 response.

- **Respond:** Write the data back to the OutputStream.

You cannot just send the HTML, you must format your string as a valid HTTP response protocol. It requires specific
headers and exact carriage-return/line-feed (\r\n) line breaks.