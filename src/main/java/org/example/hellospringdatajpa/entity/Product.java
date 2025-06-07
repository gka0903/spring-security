package org.example.hellospringdatajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Product name cannot be empty")
    private String name;
    @NotBlank(message = "Brand cannot be empty")
    private String brand;
    @NotBlank(message = "Country of origin cannot be empty")
    private String madeIn;
    @NotNull(message = "Price must be provided")
    @Min(value = 0, message = "Price must be 0 or greater")
    private Double price;

    public Product(String name, String brand, String madeIn, Double price) {
        this.name = name;
        this.brand = brand;
        this.madeIn = madeIn;
        this.price = price;
    }
}
