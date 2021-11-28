/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat5b;

import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author simon
 */
public class CChat {
    private String nickname;
    
    private CSendRecive pacchetto;
    
    private InetAddress indirizzoD;
    private String nicknameD;
    
    public CChat(String nickname, CSendRecive pacchetto) {
        this.nickname = nickname;      
        this.pacchetto = pacchetto;
        indirizzoD = null;
        nicknameD = " ";
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public CSendRecive getPacchetto() {
        return pacchetto;
    }
    public void setPacchetto(CSendRecive pacchetto) {
        this.pacchetto = pacchetto;
    }
    public InetAddress getIndirizzoD() {
        return indirizzoD;
    } 
    public void setIndirizzoD(InetAddress indirizzoDestinatario) {
        this.indirizzoD = indirizzoDestinatario;
    }
    public String getNicknameD() {
        return nicknameD;
    }
    public void setNicknameD(String nicknameDestinatario) {
        this.nicknameD = nicknameDestinatario;
    }
    
    public void connessione(String indirizzo) throws UnknownHostException, IOException{
        this.indirizzoD = InetAddress.getByName("localhost");
        
        //Faccio partire il thread per la connessione
        
        System.out.println("Cliccare la lettera A per interrompere la connessione");
        Scanner jin = new Scanner(System.in);
        String a = jin.nextLine();
        
        if(a.equals("A")){
           
            chiudiConnessione();
            
            System.out.println("Connessione interrotta");
        }
    }
    
    public void chiudiConnessione() throws IOException{
        //con la lettera "e" chiudo la connessione
        pacchetto.Send("e;", this.indirizzoD);
    }
}