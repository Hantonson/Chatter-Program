/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

/**
 *
 * @author A10-PC00
 */
public class User {
    
    static{
        //Charge all the user saves
    }
    
    private int messagesSent;
    private int totalMessagesSent;
    private String password;
    private String username;
    
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.messagesSent = 0;
        this.totalMessagesSent = 0;
    }
    
    public User(String username, String password, int totalMessagesSent){
        this.username = username;
        this.password = password;
        this.messagesSent = 0;
        this.totalMessagesSent = totalMessagesSent;
    }
    
    public void post(String message){
        
        this.totalMessagesSent++;
        this.messagesSent++;
    }
}
