/*
 * VehicleMark
 */
package com.apmanager.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author luis
 */
@javax.persistence.Entity
@Table(name="shelf")
public class Shelf implements Entity {

    @Id
    @SequenceGenerator(name="shelf-seq", sequenceName="shelf_id_seq",
            allocationSize=1)
    @GeneratedValue(generator="shelf-seq")
    private Integer id;

    private String code;

    private String description;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
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
