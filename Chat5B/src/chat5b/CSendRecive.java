/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat5b;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Arrays;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author simon
 */
public class CSendRecive {
    DatagramSocket socket;

    public CSendRecive() throws SocketException {
        this.socket = new DatagramSocket(2003);
    }
    
    public void Send(String messaggio, InetAddress indirizzo) throws IOException{
        byte[] buffer = messaggio.getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        packet.setAddress(indirizzo);
        packet.setPort(2003);
        socket.send(packet);
    }
    
    public String Receive() throws IOException{
        byte[] buffer2 = new byte[1500];
        DatagramPacket packet2 = new DatagramPacket(buffer2, buffer2.length);
        socket.receive(packet2);
        byte[] bufferDatiRicevuto = packet2.getData();
        String dati = new String(Arrays.copyOfRange(bufferDatiRicevuto, 0, packet2.getLength()));
        return dati;
    }
}