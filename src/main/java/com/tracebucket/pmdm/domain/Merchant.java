package com.tracebucket.pmdm.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ffl
 * Date: 1/5/12
 * Time: 3:57 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "MERCHANT")
public class Merchant implements Serializable {

    @Column(name = "ID", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", length = 100, nullable = false)
    @Basic
    private String name;

    @Column(name = "IMAGE")
    @Basic(fetch = FetchType.EAGER)
    private String image;

    @OneToMany(mappedBy = "merchant", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    private Set<ProductFolio> productFolios;

    @ManyToMany
    private Set<Warehouse> warehouses;
}
