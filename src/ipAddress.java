package com.javacodegeeks.java.core;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.*;
import java.net.*;



public class ipAddress {

    public static void sendPingRequest(String ipAddress) throws UnknownHostException, IOException{

        InetAddress geek = InetAddress.getByName(ipAddress);
        System.out.println("Sending a Ping Request to " + ipAddress);
        if (geek.isReachable(6000))
            System.out.println("Ping request acknowledged. Host Available");
        else
            System.out.println("Host is Unavailable");
    }

        public static void main(String[] args) throws UnknownHostException, IOException {




            System.out.println();
            System.out.print("localhost is: ");
            System.out.println(Inet6Address.getLocalHost().getHostAddress());

            System.out.println();
            System.out.print("Give a valid domain: ");
            Scanner reader= new Scanner(System.in);
            String domain= reader.next();
            System.out.println(Inet6Address.getByName(domain));

            System.out.println();
            System.out.println("All IP Addresses that are assigned to "+domain+" are: ");
            InetAddress[] inetAddresses = Inet6Address.getAllByName(domain);

            for (InetAddress ipAddress : inetAddresses) {
                System.out.println(ipAddress);
            }

                        System.out.println();
                        Scanner sc= new Scanner(System.in);
                        System.out.print("Ping an IPv6 Address: ");
                        String userIpAddress;
                        userIpAddress= sc.nextLine();
                        System.out.println();
                        sendPingRequest(userIpAddress);



        }
}


