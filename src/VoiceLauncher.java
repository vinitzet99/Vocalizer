/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
//Imports
import com.sun.speech.freetts.VoiceManager;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

 
/**
 *
 * @author ex094
 */
public class VoiceLauncher extends Voice {
    JFrame f;
    JPanel p;
   TextArea a;
   JButton b;
   JButton b1;
   String k;
   VoiceLauncher()
    {
    f=new JFrame();
    p=new JPanel();
    
    f.setVisible(true);
    f.setSize(500,300);
    
    f.add(p);

   

    a=new TextArea();
    p.add(a);
   b=new JButton("START");
   p.add(b);
   
   b1=new JButton("STOP");
   p.add(b1);
       }
    
    void VoiceLauncher()
    {
       
     b.addActionListener((ActionEvent e) -> {
         a.setText("\t" +"LOADING.......");
         
         try{
             // Configuration Object
             
             Configuration configuration = new Configuration();
             
             // Set path to the acoustic model.
             configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
             // Set path to the dictionary.
             configuration.setDictionaryPath("1101.dic");
             // Set path to the language model.
             configuration.setLanguageModelPath("1101.lm");
             //Recognizer Object, Pass the Configuration object
             LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);
             
             //Start Recognition Process (The bool parameter clears the previous cache if true)
             // recognize.startRecognition(false);
             recognize.startRecognition(true);
             //Create SpeechResult Object
             SpeechResult result;
             Voice v=new Voice();
             v.Voice("kevin16");
             int count=1;
             
             //Checking if recognizer has recognized the speech
             while ((result = recognize.getResult()) != null) {
                 //Get the recognize speech
                 if(count==1)
                 {
                     a.setText("Welcome Sir");
                     v.say("Welcome Sir");
                     count--;
                     continue;
                 }
                 String command = result.getHypothesis();
                 k=command;
                 Runtime ru=Runtime.getRuntime();
                 Process pro;
                 
                 Functioning fn= new Functioning();
                 a.setText("You said: "+k);
                 int flag=0;
                 
                 System.out.println("functioning");
    
                 
                 Scanner sc=new Scanner(System.in);
                 String s=" ";
                 fn.search(s);
                 
                 
                 System.out.println(command);
    
                 
                 if(command.equalsIgnoreCase("open file manager"))
                 {
                     fn.explorero(command);
                     flag=1;
                 }
                 else if (command.equalsIgnoreCase("open chrome"))
                 {
                     fn.chromeo(command);
                     flag=1;
                     Scanner sc1=new Scanner(System.in);
                     String ss=sc1.nextLine();
                     fn.search(ss);
                 }
                 else if (command.equalsIgnoreCase("close chrome"))
                 {
                     fn.chromec(command);
                     flag=1;
                 }
                 else if(command.equalsIgnoreCase("open calc"))
                 {
                     fn.calco(command);
                     flag=1;
                 }
                 else if (command.equalsIgnoreCase("close calc"))
                 {
                     fn.calcc(command);
                     flag=1;
                 }
                 else if (command.equalsIgnoreCase("open control panel "))
                 {
                     fn.controlo(command);
                     flag=1;
                 }
                 else if (command.equalsIgnoreCase("close control panel"))
                 {
                     fn.controlc(command);
                     flag=1;
                 }
                 else if(command.equalsIgnoreCase("OPEN WORD"))
                 {
                     System.out.println("functioning WORD");
                     fn.wordo(command);
                     flag=1;
                     //a.setText("Word Opened");
                     //v.say("Word Opened");
                     
                 }
                 else if (command.equalsIgnoreCase("close word"))
                 {
                     
                     fn.wordc(command);
                     flag=1;
                 }
                 else if (command.equalsIgnoreCase("open excel"))
                 {
                     fn.excelo(command);
                     flag=1;
                 }
                 else if (command.equalsIgnoreCase("close excel"))
                 {
                     fn.excelc(command);
                     flag=1;
                 }
                 else if(command.equalsIgnoreCase("open music"))
                 {
                     fn.musico(command);
                     flag=1;
                 }
                 else if (command.equalsIgnoreCase("close music"))
                 {
                     fn.musicc(command);
                     flag=1;
                 }
                 else if (command.equalsIgnoreCase("open power"))
                 {
                     fn.powero(command);
                     flag=1;
                 }
                 else if (command.equalsIgnoreCase("close power"))
                 {
                     fn.powerc(command);
                     flag=1;
                 }
                 if(flag==1)
                 {
                     String[] words=k.split("\\s");
                     words[0]=words[0].concat("D");
                     String out=words[1]+" "+words[0];
                     a.setText(out);
                     v.say(out);
                 }
                 /* String cmp=null;
                 if(flag==0)
                 {
                 String nope="I cant Hear. Please repeat";
                 a.setText(nope);
                 v.say(nope);
                 
                 }*/
                 
             }
         }
         
         catch(IOException e11)
         {
             throw new RuntimeException(e11);
             
         }
         
         catch(NumberFormatException e111)
         {
             throw new RuntimeException(e111);
             
         }
     });  
  }
    
    public static void main(String[] args) throws IOException {

            VoiceLauncher v=new VoiceLauncher();
            v.VoiceLauncher();
            
    }
 
}
