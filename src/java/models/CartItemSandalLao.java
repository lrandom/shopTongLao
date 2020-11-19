/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Lrandom
 */
public class CartItemSandalLao {
     public int quantity = 0;
     public SandalLao sandalLao;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SandalLao getSandalLao() {
        return sandalLao;
    }

    public void setSandalLao(SandalLao sandalLao) {
        this.sandalLao = sandalLao;
    }
     
    public void increateQuantity(){
        this.quantity = this.quantity +1;
    } 
}
