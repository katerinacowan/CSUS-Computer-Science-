//SELF GRADE:I would give a 100/100 because I followed the document and matched the output
import java.util.*;
public class DocumentCowan //<-------add your last name here
{
   //no code goes here. Must leave empty
}
class Document
{
	 private String content;
//Document class methods
	    public Document(String content) {
	        this.content = content;
	    }
	    public String getContent() {
	        return content;
	    }
	    public void setContent(String newContent) {
	        this.content = newContent;
	    }
	   
	    public String toString() {
	        return String.format("Content: %s\n", this.getContent());
	    }
	    public int getContentLength(){
	        return this.content.length();
	    }
	    public Boolean contains(String keyword){
	        if(this.content.contains(keyword)){
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public Boolean equals (Document other){
	        if(this.content.equalsIgnoreCase(other.content)){
	            return true;
	        } else {
	            return false;
	        }
	    }

	}

//email class
class Email extends Document
{                        
    private String sender;              // Defining all the variables mentioned
    private String recipient;
    private String text;
    private Date date;
    private String subject;
    private String cc;
    boolean isSent;
    //constructor
    	public Email(String content, String sender, String recipient, String subject, String cc) {
    		super(content);
    		this.text = content;
    		this.sender = sender;
    		this.recipient = recipient;
    		this.subject = subject;
    		this.cc = cc;
    		this.date = new Date();
    	}
    	//email class methods
        public void send(){
            this.isSent = true;
        }
        public boolean getSent(){
            return isSent;
        }
        public String getSender(){
            return this.sender;
        }
        public String getRecipient(){
            return this.recipient;
        }
        public String getText(){
            return this.text;
        }
        public String getSubject(){
            return this.subject;
        }
        public String getCC(){
            return this.cc;
        }
        public Date Date(){
            return this.date;
        }
        public void setSender(String s){
        	if(isSent == false){            
                this.sender = s;
            } else {
                System.out.println("This email has been sent and cannot be modified");
            }
        }

        public void setRecipient(String s) {
        	if(isSent == false){
                this.recipient = s;
            } else {
                System.out.println("This email has been sent and recipient cannot be modified");
            }
        }

        public void setSubject(String s){
        	if(isSent == false){
                this.subject = s;
            } else {
                System.out.println("This email has been sent and subject field cannot be modified");
            }
        }

        public void setCC(String c){
        	if(isSent == false){
                this.cc = c;
            } else {
                System.out.println("This email has been sent and cc field cannot be modified");
            }
        }
        //displays all the information of the sender, recipient, subject, date, and content
        public String toString() {
            return
            String.format("Sender: " + sender + "%n" +
                            "Recipient: " + recipient + "%n"+
                            "Subject: " + subject  + "%n"+
                            "Date: " + date + "%n"+
                            "Content: " + super.toString());
        }
        public void modifyContent(String s){
        	if(isSent == false){
                super.setContent(s);
            } else{
                System.out.println("This email has been and sent and the Content cannot be modified.");
            }
        }
        public Email forward(String rec, String sender, String cc){
            Email f = new Email(text,sender,rec,subject,cc);
            f.date = new Date();
            f.isSent = true;
            return f;
        }
        //added this to find how many words were in the document
		public int getDocumentLength() {
			return this.getContentLength();
		}
		

    }
 //Driver class
class EmailDriver
{
	
    public static void main(String[] args)
    {
      //creating an Email object
       Email e1 = new Email("Hello everyone, we will have a meeting tomorrow at 10", "Gita Faroughi","Alex","Meeting","");
      
       //sending the email
       e1.send();
       
       //disply the details about the email
       System.out.println(e1);
       System.out.println("\n\n");
       
       //searching the email for the email for the word tomorrow
       boolean b = e1.contains("tomorrow");
       if(b)
         System.out.println("The word tomorrow was found in the email");
       else
          System.out.println("The word tomorrow was not found in the email"); 
           
      
       //displaying just the content(text) of the email
       System.out.println("\nThe content of this email is: " + e1.getText());
       System.out.println();
       //modifying the content of the email
       e1.modifyContent("bye");
       
       //changing the recipient of the e1 email
       e1.setRecipient("Jose@yahoo.com,Mary@gmail.com");
       System.out.println();
       
       //forwarding the email
       Email forward = e1.forward("Alex", "Gita" ,"Maria");
       System.out.println();
       
       //printing the forwarded email 
       System.out.println("forwarded message\n"+ forward);
       System.out.println();
       
       //display the length of the text in the email
       
       System.out.println("The number of the letters in the email is: " + e1.getDocumentLength());
       
       //Separates the given code vs. my code 
       
        System.out.println("**********************************************************************");
        
       //my code
        
       Email e2 = new Email("Hello everyone, we will have dinner tomorrow at 6", "John","Bob","Dinner","");
       
       //sending the email
       e2.send();
       
       //disply the details about the email
       System.out.println(e2);
       System.out.println("\n\n");
       
       //searching the email for the email for the word tomorrow
       boolean b2 = e2.contains("dinner");
       if(b2)
         System.out.println("The word dinner was found in the email");
       else
          System.out.println("The word dinner was not found in the email"); 
           
      
       //displaying just the content(text) of the email
       System.out.println("\nThe content of this email is: " + e2.getText());
       System.out.println();
       //modifying the content of the email
       e2.modifyContent("bye");
       
       //changing the recipient of the e1 email
       e2.setRecipient("Bob@yahoo.com,Susan@gmail.com");
       System.out.println();
       
       //forwarding the email
       Email forward2 = e2.forward("Bob", "John" ,"Stacey");
       System.out.println();
       
       //printing the forwarded email 
       System.out.println("forwarded message\n"+ forward2);
       System.out.println();
       
       //display the length of the text in the email 
       System.out.println("The number of the letters in the email is: " + e2.getDocumentLength());
       
       
    }
}