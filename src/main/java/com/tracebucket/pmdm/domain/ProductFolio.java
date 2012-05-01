package com.tracebucket.pmdm.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ffl
 * Date: 1/5/12
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "PRODUCT_FOLIO")
public class ProductFolio implements Serializable {

    @Column(name = "ID", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", length = 100, nullable = false)
    @Basic
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({ @JoinColumn(name = "MERCHANT__ID", referencedColumnName = "ID", nullable = false) })
    private Merchant merchant;

    @OneToMany(mappedBy = "productFolio", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    private Set<Article> articles;

    @ManyToMany
    private Set<MetaAttribute> metaAttributes;
}
