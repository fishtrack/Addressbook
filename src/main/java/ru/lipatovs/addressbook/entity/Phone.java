package ru.lipatovs.addressbook.entity;

import java.util.Date;

public class Phone {
    public int id;
    public int personId;
    public String number;
    public Date createdAt;
    public Date updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Phone(int id, int personId, String number, Date createdAt, Date updatedAt) {
        this.id = id;
        this.personId = personId;
        this.number = number;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Phone(){}
}
