package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class Product_Electronic extends Product{
    private double batterie_duration;

    @Override
    public String toString() {
        return "Product_Electronic{" +
                "batterie_duration=" + batterie_duration +
                '}';
    }
}
