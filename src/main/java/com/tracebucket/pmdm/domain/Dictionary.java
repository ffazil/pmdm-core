package com.tracebucket.pmdm.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ffl
 * Date: 1/5/12
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dictionary implements Serializable {

    @Column(name = "ID", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Article article;

    @Column(name = "VALUE", length = 100, nullable = false)
    @Basic
    private String value;
}
