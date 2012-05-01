package com.tracebucket.pmdm.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ffl
 * Date: 1/5/12
 * Time: 3:46 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

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

    @Column(name = "DESCRIPTION")
    @Basic(fetch = FetchType.EAGER)
    private String description;

    @OneToMany(mappedBy = "product")
    @MapKeyJoinColumn(name = "META_ATTRIBUTE__ID")
    private Map<MetaAttribute, BaseDictionary> baseAttributes;
}
