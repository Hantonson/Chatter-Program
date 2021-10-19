/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import Runnables.ClientConnection;
/**
 *
 * @author A10-PC00
 */
public class Server {
    private ArrayList<String> messages;
    private int numberOfConections;
    private ServerSocket servSock;
    private boolean active;
    
    public Server(){
        this.messages = new ArrayList<>();
        this.numberOfConections = 0;
        try {
            this.servSock = new ServerSocket(3000);
        } catch (IOException ex) {
            System.err.println("Impossible to create server. Exiting program");
            System.exit(-1);
        }
        this.active = false;
    }
    
    public void start(){
        this.active = true;
        while(this.active){
            Socket s;
            try{
                s = this.servSock.accept();
                Thread t = new Thread(new ClientConnection(s,this));
            }catch (IOException ex){
                System.err.println("An incoming connection was refused:\n");
                ex.printStackTrace();
            }
        }
    }
    
    public void stop(){
        this.active = false;
        //Wait until all connections are closed
    }
}
