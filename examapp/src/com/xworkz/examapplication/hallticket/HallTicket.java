package com.xworkz.examapplication.hallticket;

public class HallTicket {
    public  int id;
    String subName;
    String subCode;
    String usncode;
    String candidateName;
    public HallTicket(int id,String subName,String subCode,String usncode,String candidateName){
        this.id= id;
        this.subName=subName;
        this.subCode=subCode;
        this.usncode=usncode;
        this.candidateName=candidateName;
    }
    public void displayDetails(){
        System.out.println("candidate is is"+this.id);
        System.out.println("candidate subCode is "+this.subCode);
        System.out.println("candidate subName is "+this.subName);
        System.out.println("candidate usn-code is "+this.usncode);
        System.out.println("candidate candidateName is "+this.candidateName);


    }
}


