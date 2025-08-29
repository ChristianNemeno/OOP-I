package com.ecom.productcatalog.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private Double price;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name="category_id", nullable=false)
    @JsonManagedReference
    private Category category;
    /**     The join column used for joining an entity association
     *      means the category_id column in product will store the foreign key in Category entity
     */
}
