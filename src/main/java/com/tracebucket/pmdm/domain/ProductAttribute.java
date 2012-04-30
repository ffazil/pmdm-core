package com.tracebucket.pmdm.domain;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * @author FFL
 */
public class ProductAttribute implements Serializable {

    @Id
    private Integer id;
    @ManyToOne
    private Product product;


}
