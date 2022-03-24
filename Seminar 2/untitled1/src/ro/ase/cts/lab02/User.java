package ro.ase.cts.lab02;

import java.util.List;

public class User {
    private int id;    //length>=1
    private String username;    //length >= 5
    private String name;
    private List<Order> orderHistory;
    private Cart shoppingCart;

    public User(int id, String username, String name) {
        this.id = id;
        this.username = username;
        this.name = name;
    }

    public void addOrderToHistory(Order order){

    }

    public void addProductToCart(Product product){

    }
}
