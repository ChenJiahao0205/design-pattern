package pers.chenjiahao.adapter;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedReader br = null;
        try {
            fis = new FileInputStream("test.text");
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String line = br.readLine();
            while (line != null && !line.equals("")){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
