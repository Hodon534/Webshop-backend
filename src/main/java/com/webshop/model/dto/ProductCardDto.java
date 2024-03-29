package com.webshop.model.dto;

import lombok.*;

import java.math.BigDecimal;

/**
 * Data Transfer Object (DTO) representing a product card.
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductCardDto {
    private long id;
    private String name;
    private String description;
    private String manufacturerName;
    private long manufacturerId;
    private String category;
    private String image;
    private BigDecimal price;
    private long inStock;

    /**
     * Constructs a new ProductCardDto with the provided information.
     *
     * @param name          The name of the product.
     * @param description   The description of the product.
     * @param manufacturerName The manufacturers name of the product.
     * @param manufacturerId The manufacturers ID.
     * @param category      The category of the product.
     * @param image         The URL of the product image.
     * @param price         The price of the product.
     * @param inStock       The quantity of the product in stock.
     */
    public ProductCardDto(String name, String description, String manufacturerName, long manufacturerId, String category, String image, BigDecimal price, long inStock) {
        this.name = name;
        this.description = description;
        this.manufacturerName = manufacturerName;
        this.manufacturerId = manufacturerId;
        this.category = category;
        this.image = image;
        this.price = price;
        this.inStock = inStock;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public long getManufacturerId() {
        return manufacturerId;
    }

    public String getCategory() {
        return category;
    }

    public String getImage() {
        return image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public long getInStock() {
        return inStock;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setManufacturerId(long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setInStock(long inStock) {
        this.inStock = inStock;
    }
}
