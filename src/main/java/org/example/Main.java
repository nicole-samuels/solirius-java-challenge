package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {

    static void main() throws IOException {

        final int port = 8080;
        final ServerSocket server = new ServerSocket(port);
        System.out.printf("Listening for connection on port %d ", port);

        while (true){
//            Read HTTP request
//            Create a HTTP response
            try {
                Socket clientSocket =  server.accept();
                System.out.println("Client connected!");
                handleRequest(clientSocket);
            } catch (IOException e) {
                System.err.println("Connection Error: "+ e.getMessage());
            }
        }

    }

    private static void handleRequest(Socket clientSocket) {
//        TODO: Read the request from clientSocket.getInputStream()
//        TODO: Parse the route (e.g., GET /index.html)
//        TODO: Write the HTTP headers and Write the html to the OutputStream

    }


}
