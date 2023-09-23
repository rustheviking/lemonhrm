package com.virusoft.lemonhrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;


@Entity
@Table(name = "lhrm_user", indexes = {@Index(name = "idx_user_role_id", columnList = "user_role_id"), @Index(name = "idx_emp_number", columnList = "emp_number"), @Index(name = "idx_modified_user_id", columnList = "modified_user_id"), @Index(name = "idx_created_by", columnList = "created_by")})
public class User extends IdBasedEntity {
    @Column(name = "user_role_id", nullable = false)
    private Integer userRoleId;

    @Column(name = "emp_number")
    private Integer empNumber;

    @Column(name = "user_name", length = 40)
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "deleted", nullable = false, columnDefinition = "tinyint(1) default 0")
    private Boolean deleted;

    @Column(name = "status", nullable = false, columnDefinition = "tinyint(1) default 1")
    private Boolean status;

    @Column(name = "date_entered")
    private LocalDateTime dateEntered;

    @Column(name = "date_modified")
    private LocalDateTime dateModified;

    @Column(name = "modified_user_id")
    private Integer modifiedUserId;

    @Column(name = "created_by")
    private Integer createdBy;


    //---------------- Setters and Getters -------------------
    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Integer empNumber) {
        this.empNumber = empNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDateTime getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(LocalDateTime dateEntered) {
        this.dateEntered = dateEntered;
    }

    public LocalDateTime getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }

    public Integer getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
}
