package com.xpanxion.java.assignments.model;

import java.util.Objects;

public class Product {

    //
    // Data members
    //

    private int id;
    private int departmentId;
    private String departmentName;
    private String name;
    private float price;
    private String sku;

    //
    // Constructors
    //

    public Product() {
    }

    public Product(int id, int departmentId, String name, float price, String sku) {
        this.id = id;
        this.departmentId = departmentId;
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    public Product(int id, int departmentId, String departName, String name, float price, String sku) {
        this.id = id;
        this.departmentId = departmentId;
        this.departmentName = departName;
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    //
    // Accessors
    //

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    //
    // Overrides
    //

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Product))
            return false;
        Product product = (Product) o;
        return getId() == product.getId() && getDepartmentId() == product.getDepartmentId()
                && Float.compare(product.getPrice(), getPrice()) == 0 && getName().equals(product.getName())
                && getSku().equals(product.getSku());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDepartmentId(), getName(), getPrice(), getSku());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sku='" + sku + '\'' +
                '}' + '\n';
    }
}
