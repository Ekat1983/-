package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Smartphone extends Product {

    public String manufacturer;

    public Smartphone(int id, int cost, String manufacturer, String name) {
        super(id, name, cost);
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean matches(String query) {
        if (super.matches(query)) {
            return true;
        }
        if (manufacturer.contains(query)) {
            return true;
        }
        return false;
    }
}
