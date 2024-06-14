
package data;

import business.Login;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class LoginDB implements ILogin{
    private File myObj;
    public LoginDB() {
         myObj=new File("login.txt");
    }

    @Override
    public boolean add(Login l) {
        try{
           
           FileWriter fw=new FileWriter(myObj,true);
           String line=l.getUserID()+" "+l.getPassword()+"\n";
           fw.append(line);
           fw.close();
           return true;
       }catch(IOException e){
           JOptionPane.showMessageDialog(null, e.getMessage());
           return false;
       }
    }

    @Override
    public Login get(String userID) {
        ArrayList<Login> bList=getAll();
        for(Login b:bList){
            if(b.getUserID().equals(userID)){
                return b;
            }
        }
        return null;
    }

    @Override
    public boolean update(Login l) {
        try{
            ArrayList<Login> bList=getAll();
            FileWriter fw1=new FileWriter(myObj);
            fw1.write("");
            fw1.close();
            
            for(Login bk:bList)
            {
                if(bk.getUserID().equals(l.getUserID())){
                    bList.remove(bk);
                    bList.add(l);
                    break;
                }
            }
            
            for(Login b1: bList){
                add(b1);
            }
            return true;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(String userID) {
         try{
            ArrayList<Login> bList=getAll();
            FileWriter fw1=new FileWriter(myObj);
            fw1.write("");
            fw1.close();
            
            for(Login b:bList){
                if(b.getUserID().equals(userID)){
                    bList.remove(b);
                    break;
                }
            }
            
            for(Login b1:bList){
                add(b1);
            }
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList<Login> getAll() {
       ArrayList<Login> bList=new ArrayList<>();
        try{
            Scanner sc=new Scanner(myObj);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                String[] arr=line.split(" ");
                String userID=arr[0];                
                String password=arr[1];                
                 Login log=new Login(userID, password);
                bList.add(log);
            }
            sc.close();
            return bList;
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    
    
     @Override
    public boolean added(Login l) {
       try{
           
           FileWriter fw=new FileWriter(myObj,true);
           String line=l.getUserID()+"  "+l.getPassword()+"\n";
           fw.append(line);
           fw.close();
           return true;
       }catch(IOException e){
           JOptionPane.showMessageDialog(null, e.getMessage());
           return false;
       }
    }
    
}
