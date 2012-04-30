package com.tracebucket.pmdm.domain;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author FFL
 */
public class MetaAttribute implements Serializable {
    @Id
    private Integer id;
    private String name;
    private String description;
}
