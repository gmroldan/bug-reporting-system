package org.sample.errorreportingsystem.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Issue {

    private Integer id;
    private String area;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String description;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date creationDate;

    /**
     * No args class constructor.
     */
    public Issue() {}

    /**
     * Class constructor.
     *
     * @param area
     * @param name
     * @param surname
     * @param phone
     * @param email
     * @param description
     */
    public Issue(String area, String name, String surname, String phone, String email, String description) {
        this.area = area;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.description = description;
    }

    /**
     * Class constructor.
     *
     * @param id
     * @param area
     * @param name
     * @param surname
     * @param phone
     * @param email
     * @param description
     * @param creationDate
     */
    public Issue(Integer id, String area, String name, String surname, String phone, String email, String description, Date creationDate) {
        this.id = id;
        this.area = area;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.description = description;
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
