package com.xworkz.policestationapp.officer;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Officer {

    private int officerId;
    private String officerName;
    private int officerAge;
    private String officerEmailId;
    private String officerPostName;
    private String bloodGroup;
    private String officerGender;
    private String officerAddress;

}
