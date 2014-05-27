package com.hubpages.plusminus;
 
import com.opensymphony.xwork2.ActionSupport;
 
public class MavenDemo extends ActionSupport{
 
    private static final long serialVersionUID = 1L;
 
    public String message = "Hello PlusMinus....";
     
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
 
    public String displayMessage(){
        setMessage(message);
        System.out.println(message);
        return SUCCESS;
    }
     
    public String executeAll(){
        displayMessage();
        return SUCCESS;
    }
     
    public static void main (String args[]){
        MavenDemo md = new MavenDemo();
        md.executeAll();
    }
    
    
    class A{
    	String name;
    }
}