package com.example.grievance_management_system;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long USER_ID;
    @Column(name = "EMAIL_ID", nullable = false)
    private String EMAIL_ID;
    @Column(name = "NAME")
    private String NAME;
    @Column(name = "PASSWORD")
    private String PASSWORD;
    @Column(name = "PHONE_NO")
    private int PHONE_NO;
    @Column(name = "FORGOT_PASSWORD")
    private String FORGOT_PASSWORD;

    public long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(long USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getEMAIL_ID() {
        return EMAIL_ID;
    }

    public void setEMAIL_ID(String EMAIL_ID) {
        this.EMAIL_ID = EMAIL_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public int getPHONE_NO() {
        return PHONE_NO;
    }

    public void setPHONE_NO(int PHONE_NO) {
        this.PHONE_NO = PHONE_NO;
    }

    public String getFORGOT_PASSWORD() {
        return FORGOT_PASSWORD;
    }

    public void setFORGOT_PASSWORD(String FORGOT_PASSWORD) {
        this.FORGOT_PASSWORD = FORGOT_PASSWORD;
    }

    @Override
    public String toString()
    {
        return "user{" +
                "USER_ID=" + USER_ID +
                ", EMAIL_ID='" + EMAIL_ID + '\'' +
                ", NAME='" + NAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", PHONE_NO='" + PHONE_NO + '\'' +
                ", FORGOT_PASSWORD='" + FORGOT_PASSWORD + '\'' +
                '}';
    }

}
