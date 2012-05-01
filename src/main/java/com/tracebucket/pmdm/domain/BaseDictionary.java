package com.tracebucket.pmdm.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ffl
 * Date: 1/5/12
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "BASE_DICTIONARY")
public class BaseDictionary implements Serializable {

    @Column(name = "ID", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    private Product product;

    @Column(name = "VALUE", length = 100, nullable = false)
    @Basic
    private String value;
}
