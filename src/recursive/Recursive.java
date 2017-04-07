/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive;

/**
 *
 * @author Hailey.Jones
 */
public class Recursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s = hello("dolly", 0);
        
        System.out.println(s);
    }
    
    public static String hello(String s, int count){
        count++;
        if (count>10){
        return "done";
        }
    return hello(s+"hello", count);
    
    }
    
    
}
