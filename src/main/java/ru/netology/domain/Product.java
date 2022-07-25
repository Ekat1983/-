package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private int id;
    protected String name;
    private int cost;


    public boolean matches(String query) {
        if (name.contains(query)) {
            return true;
        }
        return false;
    }
}


