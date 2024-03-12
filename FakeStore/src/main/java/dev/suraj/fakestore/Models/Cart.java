package dev.suraj.fakestore.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart {
    private Long id;
    private Long userId;
    private String date;
    private Product[] products;
    private Long __v;
}
