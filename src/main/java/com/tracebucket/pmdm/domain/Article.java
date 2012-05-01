package com.tracebucket.pmdm.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ffl
 * Date: 1/5/12
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "ARTICLE")
public class Article implements Serializable {

    @Column(name = "ID", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "SKU", length = 25, nullable = false)
    @Basic
    private String sku;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PRODUCT__ID", referencedColumnName = "ID", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({ @JoinColumn(name = "PRODUCT_FOLIO__ID", referencedColumnName = "ID", nullable = false) })
    private ProductFolio productFolio;

    @OneToMany(mappedBy = "article")
    @MapKeyJoinColumn(name = "META_ATTRIBUTE__ID")
    private Map<MetaAttribute, Dictionary> attributes;
}
