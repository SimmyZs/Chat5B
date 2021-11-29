/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chat5b;

import java.net.SocketException;

/**
 *
 * @author simon
 */
public class Chat5B {

    /**
     * @param args the command line arguments
     * @throws java.net.SocketException
     */
    public static void main(String[] args) throws SocketException {
        String nickname="simone";
        CSendRecive sr=new CSendRecive();
        CChat chat=new CChat(nickname,sr);
    }
    
}
