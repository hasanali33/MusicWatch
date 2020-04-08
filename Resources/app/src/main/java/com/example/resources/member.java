package com.example.resources;

public class member {

    private String memberEmail;
    private int memberNumber;
    private String memberName;
    private String memberYear;




    public member(String email, int number, String name, String year) {
        memberEmail = email;
        memberNumber = number;
        memberName = name;
        memberYear = year;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public void setMemberYear(String memberYear) {
        this.memberYear = memberYear;
    }

    public String getMemberEmail() {
        return memberEmail;
    }
    public int getMemberNumber() {
        return memberNumber;
    }
    public String getMemberName() {
        return memberName;
    }
    public String getMemberYear() {
        return memberYear;
    }
}
