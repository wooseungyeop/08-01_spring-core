package com.ohgiraffers.common;

public class MemberDTO {

    private int sequence;
    private String name;
    private String email;
    private String phone;
    private Account personlAccount;

    public MemberDTO(){

    }

    public MemberDTO(int sequence, String name, String email, String phone, Account personlAccount) {
        this.sequence = sequence;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.personlAccount = personlAccount;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Account getPersonlAccount() {
        return personlAccount;
    }

    public void setPersonlAccount(Account personlAccount) {
        this.personlAccount = personlAccount;
    }
}
