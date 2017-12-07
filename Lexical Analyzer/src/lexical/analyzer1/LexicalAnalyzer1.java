/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexical.analyzer1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Jisan
 */
public class LexicalAnalyzer1 {

     public static ArrayList keywords = new ArrayList();
    public static ArrayList numericValues = new ArrayList();
    public static ArrayList maths = new ArrayList();
    public static ArrayList logicals = new ArrayList();
    public static ArrayList identifiers = new ArrayList();
    public static ArrayList others = new ArrayList();
    public static String[] key = {"break","case","char","continue","do","double","else","float","for","if","int","return","switch","void","while"};
    public static String tokens = "";
    public static String[] mathOperator = {"+","-","*","/","="};
    public static String[] logicOperator = {"==","!=","||","&&","<",">","<=",">="};
    public static String[] Others = {"(",")","{","}","[","]",",","?",";",":"};

    public static void main(String[] args) throws FileNotFoundException {
         File f = new File("C:\\Users\\Jisan\\Documents\\NetBeansProjects\\Lexical Analyzer\\input.txt");
        Scanner inputLine = new Scanner(f);
        while (inputLine.hasNextLine()) {
            String line = inputLine.nextLine();
            StringTokenizer strToken = new StringTokenizer(line);
            while (strToken.hasMoreTokens()) {
                tokens = strToken.nextToken();
                for(String keys : key){
                    if(tokens.equals(keys)){
                        keywords.add(tokens);
                        break;
                    }
                    else if(tokens.matches("[a-zA-Z_0-9]")){
                        identifiers.add(tokens);
                        break;
                    }
                }
                if(tokens.matches(".*[0-9].*")){
                    numericValues.add(tokens);
                    break;
                }
        
                for(String mathop : mathOperator){
                    if(tokens.equals(mathop)){
                        maths.add(tokens);
                        break;
                    }
                }
                for(String logic : logicOperator){
                    if(tokens.equals(logic)){
                        logicals.add(tokens);
                        break;
                    }
                }
                for(String other : Others){
                    if(tokens.equals(other)){
                        others.add(tokens);
                        break;
                    }
                }
            }
        }
        System.out.print("Keywords: ");
        keywords.forEach((Object keyword) ->
        {
            System.out.print(keyword+"   ");
        });
        System.out.println();
        System.out.print("Numerical Values: ");
        numericValues.forEach((num) -> 
        {
            System.out.print(num+"   ");
        });
        System.out.println();
        System.out.print("Math operators: ");
        maths.forEach((mathop) -> 
        {
            System.out.print(mathop+"   ");
        });
        System.out.println();
        System.out.print("Logical operators: ");
        logicals.forEach((logicop) -> 
        {
            System.out.print(logicop+"   ");
        });
        System.out.println();
        System.out.print("Identifiers: ");
        identifiers.forEach((ident) -> 
        {
            System.out.print(ident+"   ");
        });
        System.out.println();
        System.out.print("Others: ");
        others.forEach((other) -> 
        {
            System.out.print(other+"   ");
        });
        System.out.println("");
    }
    
}
