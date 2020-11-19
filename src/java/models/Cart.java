/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lrandom
 */
public class Cart {

    public static final String CART_KEY = "CART";
    public HttpSession session;
    ArrayList<CartItemSandalLao> sandalsLaos = new ArrayList<CartItemSandalLao>();

    public Cart(HttpSession session) {
        this.session = session;
        if (session.getAttribute(CART_KEY) == null) {
            session.setAttribute(CART_KEY, sandalsLaos);
        } else {
            this.sandalsLaos = (ArrayList<CartItemSandalLao>)session.getAttribute(CART_KEY);
        }
    }


    public ArrayList<CartItemSandalLao> getItemsInCart() {
        return this.sandalsLaos;
    }

    public void addToCart(CartItemSandalLao cartItem) {
        boolean isExist = false;
        for (int i = 0; i < sandalsLaos.size(); i++) {
            if (sandalsLaos.get(i).getSandalLao().getId() == cartItem.getSandalLao().getId()) {
                sandalsLaos.get(i).increateQuantity();
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            sandalsLaos.add(cartItem);
        }
    
        syncCart();
    }

    public void removeItem(CartItemSandalLao cartItem) {
        for (int i = 0; i < sandalsLaos.size(); i++) {
            if (sandalsLaos.get(i).getSandalLao().getId() == cartItem.getSandalLao().getId()) {
                sandalsLaos.remove(i);
                break;
            }
        }
        syncCart();
    }

    public void emptyCart() {
        sandalsLaos.clear();
        syncCart();
    }
    
    public void syncCart(){
         this.session.setAttribute(CART_KEY, sandalsLaos);
    }
}
