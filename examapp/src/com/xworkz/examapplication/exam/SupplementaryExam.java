package com.xworkz.examapplication.exam;

import com.xworkz.examapplication.hallticket.HallTicket;

public class SupplementaryExam extends Exam{
    public int noOfAttempts = 2;

    @Override
    public boolean write(HallTicket ticket) {
        if (noOfAttempts > 1) {
            System.out.println("supplementary exam invoked");
            return super.write(ticket);
        }
        return false;
    }
}


