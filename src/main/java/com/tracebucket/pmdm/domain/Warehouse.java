package com.tracebucket.pmdm.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ffl
 * Date: 1/5/12
 * Time: 4:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Warehouse implements Serializable {

    @Column(name = "ID", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", length = 100, nullable = false)
    @Basic
    private String name;

    @Column(name = "CODE", length = 25, nullable = false)
    @Basic
    private String code;

    @OneToMany(mappedBy = "warehouse")
    @MapKeyJoinColumn(name = "PRODUCT__ID")
    private Map<Product, Stock> productStock;
}
