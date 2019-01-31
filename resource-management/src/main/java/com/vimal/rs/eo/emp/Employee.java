package com.vimal.rs.eo.emp;

public class Employee {
    private EmpId empId;
    private EmpName name;
    private EmpPay pay;
    private EmpSex sex;

    public Employee(EmpId empId, EmpName name, EmpSex sex) {
        this.empId = empId;
        this.name = name;
        this.sex = sex;
    }

    public Employee(EmpId empId, EmpName name, EmpPay pay, EmpSex sex) {
        this.empId = empId;
        this.name = name;
        this.pay = pay;
        this.sex = sex;
    }

    public EmpId getEmpId() {
        return empId;
    }

    public EmpPay getPay() {
        return pay;
    }

    public void setPay(EmpPay pay) {
        this.pay = pay;
    }

    public void setEmpId(EmpId empId) {
        this.empId = empId;
    }

    public EmpName getName() {
        return name;
    }

    public void setName(EmpName name) {
        this.name = name;
    }

    public EmpSex getSex() {
        return sex;
    }

    public void setSex(EmpSex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name=" + name +
                '}';
    }
}
