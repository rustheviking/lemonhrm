package com.virusoft.lemonhrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

@Entity
@Table(name = "lhrm_user_role", indexes = {@Index(name = "idx_user_role_name", columnList = "name")})
public class Role extends IdBasedEntity {

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "display_name", length = 255, nullable = false)
    private String displayName;

    @Column(name = "is_assignable", columnDefinition = "tinyint(1) default 0")
    private Boolean isAssignable;

    @Column(name = "is_predefined", columnDefinition = "tinyint(1) default 0")
    private Boolean isPredefined;


    //--------------------- Setter and Getter -----------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Boolean getAssignable() {
        return isAssignable;
    }

    public void setAssignable(Boolean assignable) {
        isAssignable = assignable;
    }

    public Boolean getPredefined() {
        return isPredefined;
    }

    public void setPredefined(Boolean predefined) {
        isPredefined = predefined;
    }
}
