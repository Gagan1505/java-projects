package com.xworkz.playstoreapp.application;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Application {

    private int applicationId;
    private String applicationName;
    private double appSizeInMb;
    private String companyName;
    private String releaseYear;
    private String appVersion;
    private String appType;


}
