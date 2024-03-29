package com.webshop.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * Entity class representing an address.
 */
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@Setter
@Getter
@Entity
@Table(name = "addresses")
public class AddressEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String street;
    @Column(name = "zip_code")
    private String zipCode;
    private String city;
    private String country;

    public AddressEntity(String street, String zipCode, String city, String country) {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }
}
