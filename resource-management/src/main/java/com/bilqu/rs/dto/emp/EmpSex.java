package com.bilqu.rs.dto.emp;

public enum EmpSex {

    MALE("M"),
    FEMALE("F"),
    OTHER("O");

    private String gender;

    EmpSex(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "EmpSex{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
