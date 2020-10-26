package com.operation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(80);
        get("/find/:pal",(request,response)->{
            return ""+cont(request.params("pal"));
        });
    }

    public static int cont(String palabra){
        try {
            BufferedReader in = new BufferedReader(new FileReader(Paths.get(App.class.getClassLoader().getResource("data.txt").toURI()).toFile()));
            String ln;
            int acum = 0;
            while ((ln=in.readLine())!=null){
                for(String s: ln.split(" ")){
                    //System.out.println(s);
                    if(s.toLowerCase().equals(palabra)) acum+=1;
                }
            }
            return acum;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
