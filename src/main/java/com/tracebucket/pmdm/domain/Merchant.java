package com.tracebucket.pmdm.domain;

import java.util.*;

/**
 * @author FFL
 */
public class Merchant {
    private Integer id;
    private String name;
    private String image;


    private Map<ProductProfile, Set<Product>> productsRegister = new HashMap<ProductProfile, Set<Product>>(0);
    private Set<Product> products;


    public void addProduct(ProductProfile profile, Product product){
        Set<Product> products;
        if(productsRegister.containsKey(profile))
        {
                productsRegister.get(profile).add(product);
        }
        else
        {
            products = new HashSet<Product>();
            products.add(product);
            productsRegister.put(profile, products);
        }
    }

    public Set<Product> getProducts()
    {
        if(products == null){
            products = new TreeSet<Product>();
            for(ProductProfile profile : productsRegister.keySet()){
                products.addAll(productsRegister.get(profile));
            }
        }
        return products;
    }


}
