package com.bilqu.rs.dto.emp;

public class EmpName implements Name {
    private String fName;
    private String lName;
    private String mName;
    private String suffix;

    public EmpName(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String sufix) {
        this.suffix = sufix;
    }

    public String getFullName(){
        return new StringBuilder(fName).append(mName).append(lName).append(suffix).toString();
    }

    @Override
    public String toString() {
        return "EmpName{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", mName='" + mName + '\'' +
                ", suffix='" + suffix + '\'' +
                '}';
    }
}
