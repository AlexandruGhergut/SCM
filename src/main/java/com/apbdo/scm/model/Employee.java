package com.apbdo.scm.model;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class Employee {
    private long id;
    private Long jobId;
    private Long teamId;
    private String lastName;
    private String firstName;
    private long salary;

    public Employee(@ColumnName("ID_ANGAJAT") long id,
                    @ColumnName("ID_JOB") Long jobId,
                    @ColumnName("ID_ECHIPA") Long teamId,
                    @ColumnName("NUME") String lastName,
                    @ColumnName("PRENUME") String firstName,
                    @ColumnName("SALARIU") long salary) {

        this.id = id;
        this.jobId = jobId;
        this.teamId = teamId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
