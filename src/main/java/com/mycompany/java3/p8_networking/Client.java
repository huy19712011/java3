package com.mycompany.java3.p8_networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    // We initialize our socket( tunnel )
    // and our input reader and output stream
    // we will take the input from the user
    // and send it to the socket using output strea
    private Socket socket;
    private BufferedReader input;
    private DataOutputStream out;

    // constructor with ip address and port
    public Client(String address, int port) {

        try {
            socket = new Socket(address, port);
            System.out.println("Connected...");

            input = new BufferedReader(new InputStreamReader(System.in));

            out = new DataOutputStream(socket.getOutputStream());

        } catch (IOException ex) {

            ex.printStackTrace();
        }

        // string to read message from input
        String line = "";

        // keep reading until "Stop" is input
        while (!line.equals("Stop")) {
            try {
                line = input.readLine(); // reads the line from the keyboard

                out.writeUTF(line); // writes it to the output stream
                // now we just need to collect the data  from the socket on our server
            } catch (IOException i) {
                System.out.println(i);
            }
        }

        // close the connection
        try {
            input.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Client client = new Client("127.0.0.1", 6666);
    }

}
