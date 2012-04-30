package com.tracebucket.pmdm.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author FFL
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {
    @Id
    private Integer id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "product",fetch = FetchType.EAGER)
    private Map<MetaAttribute, ProductAttribute> attributes = new HashMap<MetaAttribute, ProductAttribute>(0);

    public void addAttribute(MetaAttribute metaAttribute, ProductAttribute productAttribute){
                attributes.put(metaAttribute,productAttribute);
    }

    public Set<MetaAttribute> getMetaAttributes()
    {
        return attributes.keySet();
    }

    public ProductAttribute getProductAttribute(MetaAttribute metaAttribute){
        return attributes.get(metaAttribute);
    }

    public boolean hasMetaAttribute(MetaAttribute metaAttribute){
        if(attributes.keySet().contains(metaAttribute))
            return true;
        else
            return false;
    }
}
