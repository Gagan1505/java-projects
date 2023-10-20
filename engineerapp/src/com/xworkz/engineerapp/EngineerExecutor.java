package com.xworkz.engineerapp;

import com.xworkz.engineerapp.engineer.*;

public class EngineerExecutor {

    public static void main(String[] args) {
        Engineer eng = new CsEngineer();
        eng.problemsolving();
        CsEngineer cse = (CsEngineer) eng;
        cse.softwaredevelopment();

        Engineer eng1 = new MarineEngineer();
        MarineEngineer me = (MarineEngineer) eng1;
        me.enjoy();

        Engineer eng2 = new EIEngineer();
        eng2.problemsolving();

    }
}
