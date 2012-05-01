package com.tracebucket.pmdm.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ffl
 * Date: 1/5/12
 * Time: 4:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stock implements Serializable {
    @Column(name = "ID", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Warehouse warehouse;

    @Column(name = "TOTAL_QUANTITY", nullable = false)
    @Basic
    private Integer totalQuantity;


}
