
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.lang.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import java.io.IOException;
import java.io.PrintStream;

public class Functioning {
    
    
    Runtime ru=Runtime.getRuntime();
                     Process pro;
    
                 
                 // Set path to the acoustic model.
                 void explorero(String s)throws IOException
                 {      
                      pro=ru.exec("bat/OpenExplorer.bat");
                     
                 }
                 
                 void wordo(String s)throws IOException
                 {
                     System.out.println("functioning");
    
                    pro=ru.exec("bat/OpenWord.bat");
                 }
                 void chromeo(String s)throws IOException
                 {      
                      pro=ru.exec("bat/OpenChrome.bat");
                     
                 }
                 void calco(String s)throws IOException
                 {
                    pro=ru.exec("bat/OpenCalc.bat");
                 }
                 void controlo(String s)throws IOException
                 {      
                      pro=ru.exec("bat/OpenControl.bat");
                     
                 }
                 
                 void excelo(String s)throws IOException
                 {
                    pro=ru.exec("bat/OpenExcel.bat");
                 }
                 void musico(String s)throws IOException
                 {      
                      pro=ru.exec("bat/OpenMusic.bat");
                     
                 }
                 
                 void powero(String s)throws IOException
                 {
                    pro=ru.exec("bat/OpenPower.bat");
                 }
                 
                 void wordc(String s)throws IOException
                 {
                    pro=ru.exec("bat/CloseWord.bat");
                 }
                 void chromec(String s)throws IOException
                 {      
                      pro=ru.exec("bat/CloseChrome.bat");
                     
                 }
                 void calcc(String s)throws IOException
                 {
                    pro=ru.exec("bat/CloseCalc.bat");
                 }
                 void controlc(String s)throws IOException
                 {      
                      pro=ru.exec("bat/CloseControl.bat");
                     
                 }
                 
                 void excelc(String s)throws IOException
                 {
                    pro=ru.exec("bat/CloseExcel.bat");
                 }
                 void musicc(String s)throws IOException
                 {      
                      pro=ru.exec("bat/CloseMusic.bat");
                     
                 }
                 
                 void powerc(String s)throws IOException
                 {
                    pro=ru.exec("bat/ClosePower.bat");
                 }
                 
                 void search(String s)throws IOException
                 {
                  File newf1 =new File("bat/query.bat");
                     newf1.delete();
                     
                     String[] q=s.split(" ");
                     String k = null;
                     int i=0;
                     for(String a:q)
                     {
                         if(i==0)
                             k=a;
                         else
                             k=k+ "+" +a;
                            
                         i++;
                     }
                     FileWriter out=new FileWriter("bat/query.txt");
                     out.write("start www.google.com/search?q="+ k);
                     out.close();
                     
                     File old=new File("bat/query.txt");
                     File newf =new File("bat/query.bat");
                     boolean flag=old.renameTo(newf);
                    pro=ru.exec("bat/query.bat");
                    pro=ru.exec("bat/Search.bat");
                    
                     
                 }
                 
}
                
                     
                        
    
    
    
    
    
    
    
    
    
    
    
    

