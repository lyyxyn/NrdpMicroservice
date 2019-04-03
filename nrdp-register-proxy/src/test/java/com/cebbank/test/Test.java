package com.cebbank.test;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException, MalformedURLException {
        String path = System.getProperty("java.class.path");
        String path2 = Test.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String[] split = path.split(":");
        System.out.println(path);
        for (String s:split){
            if (s.contains("nrdp-register-proxy/target/test-classes")){
                System.out.println(s);
            }
        }
        System.out.println(path2);


        String url="localhost:8080";
        String concat = "http://".concat(url);
        System.out.println(concat);


        //通过主机名获取InetAddress
        InetAddress inetAddress= InetAddress.getByName("localhost");
        String canonicalHostName = inetAddress.getCanonicalHostName();
        System.out.println(canonicalHostName);
        String hostAddress = inetAddress.getHostAddress();
        System.out.println(hostAddress);


        //通过ip获取InetAddress
        String ip="192.168.43.131";
        String[] split1 = ip.split("\\.");
        byte[] ipBytes=new byte[4];
        for (int i=0;i<split1.length;i++){
            int m=Integer.parseInt(split1[i]);
            byte b=(byte)(m&0xff);
            ipBytes[i]=b;
        }
        InetAddress byAddress = InetAddress.getByAddress(ipBytes);
        String canonicalHostName1 = byAddress.getCanonicalHostName();
        System.out.println(canonicalHostName1);
        String hostAddress1 = byAddress.getHostAddress();
        System.out.println(hostAddress1);


        String substring = "http://server1:8000/health".substring("http://server1:8000/health".lastIndexOf("/"));
        System.out.println(substring);


        URL url1=new URL("http",InetAddress.getLocalHost().getHostName(),8000,"");
        String string = url1.toString();
        System.out.println(string);
    }
}
