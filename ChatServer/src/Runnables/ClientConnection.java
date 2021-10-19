/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runnables;

import chatserver.Server;
import java.net.Socket;

/**
 *
 * @author A10-PC00
 */
public class ClientConnection implements Runnable{
    
    private final Socket sock;
    private final Server serv;
    
    public ClientConnection(Socket sock, Server serv){
        this.sock = sock;
        this.serv = serv;
    }
    
    //Functions for running
    
    
    @Override
    public void run(){
        
    }
    
}
