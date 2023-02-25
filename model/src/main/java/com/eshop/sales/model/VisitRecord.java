package com.eshop.sales.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VisitRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String visitorName;

    private String visitTime;

    public Long getId() {
        return id;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }
}
