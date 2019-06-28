package kr.co.tiggle.jpa.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @NotNull
    private String id;

    @NotNull
    @Column(name = "pass")
    private String pass;

    private String email;
    private String shareEmail;
    private String auth;
    private String regId;
    private LocalDate regiDate;
    private String modfId;
    private LocalDate modfDate;
    private String deleId;
    private LocalDate deleDate;

//    @ManyToOne
//    private T_Donation tDonation;

}
