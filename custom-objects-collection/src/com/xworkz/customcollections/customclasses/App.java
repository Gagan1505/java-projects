package com.xworkz.customcollections.customclasses;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class App implements Comparable<App>{

    private int appId;
    private String appName;
    private String appType;
    private double appSize;

    @Override
    public int compareTo(App app) {
//        return (int)(this.appSize - app.appSize);
        return this.appId - app.appId;
    }
}
