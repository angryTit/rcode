package ru.angrytit.rcode;

import org.rosuda.REngine.Rserve.RConnection;

public class Main {
    public static void main(String[] args) {
        RConnection connection = null;
        try {
            connection = new RConnection();
            connection.eval("source('/data/MyScript.R')");
            int num1 = 10;
            int num2 = 20;
            int sum = connection.eval("myAdd(" + num1 + "," + num2 + ")").asInteger();
            System.out.println("The sum is=" + sum);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } finally {
                }
            }
        }
    }
}
