/*
 * VehicleMark
 */
package com.apmanager.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author luis
 */
public class Shelf implements Entity {

    private Integer id;

    private String code;

    private String description;

    private Date registerDate;

    /**
     *
     * @return
     */
    @Override
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @param id
     */
    @Override
    public void setId(Serializable id) {
        this.id = (Integer) id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
