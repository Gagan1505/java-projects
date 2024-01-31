package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "email")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailEntity {

    @Id
    @Column(name = "e_id")
    private int emailId;

    @Column(name = "e_address")
    private String address;

    @Column(name = "e_from")
    private String fromPerson;

    @Column(name = "e_to")
    private String toPerson;

    @Column(name = "e_subject")
    private String subject;

    @Column(name = "e_type")
    private String emailType;

    @Column(name = "e_body")
    private String emailBody;

    @Column(name = "e_sentDate")
    private LocalDate emailSentDate;

    @Column(name = "e_success")
    private boolean emailSuccess;
}
