package com.bilqu.rs.dto.emp;

import java.util.Objects;

public class EmpId {
    private int id;
    private long ssn;

    public EmpId(int id, long ssn) {
        this.id = id;
        this.ssn = ssn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpId)) return false;
        EmpId empId = (EmpId) o;
        return getId() == empId.getId() && getSsn() == empId.getSsn();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSsn());
    }

    @Override
    public String toString() {
        return "EmpId{" +
                "id=" + id +
                ", ssn=" + ssn +
                '}';
    }
}
