package com.paperfactory.factorymanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Product {

    @Id
    private String code;
    private String name;
    private String type;

}
