
package com.pets.vo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Dog {
    private int did;
    private String name;
    private String color;
    private int price;

    public Dog(int did, String name, String color, int price) {
        this.did = did;
        this.name = name;
        this.color = color;
        this.price = price;
    }
}
