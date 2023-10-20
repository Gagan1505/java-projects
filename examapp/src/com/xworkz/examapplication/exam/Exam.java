package com.xworkz.examapplication.exam;

import com.xworkz.examapplication.hallticket.HallTicket;

public class Exam {
    HallTicket ticket;
    public int fees;
    public Exam(){

    }
    public boolean write(HallTicket ticket){
        boolean isAllved=false;
        this.ticket = ticket;
        if(fees >=1200){
            System.out.println("fees is paid proceed to exam");

            if(ticket!=null){
                System.out.println("issue the hall-ticket");


                System.out.println("details are available issue the hall ticket ");
                this.ticket.displayDetails();
                isAllved=true;

            }else{
                System.out.println("details not found provide details");
            }
        }else{
            System.out.println("first pay the fees pleas");
        }
        return isAllved;
    }

}


