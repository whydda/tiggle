package kr.co.tiggle.jpa.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class T_Donation {

    @Id
    @GeneratedValue
    private String donaSeq;

    private String donaCode;
    private String donaName;
    private String prodCode;
    private int prodSeq;
    private int donaPrice;

//    @OneToMany(mappedBy="tDonation")
//    private List<User> user;

}
