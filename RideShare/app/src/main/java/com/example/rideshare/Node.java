package com.example.rideshare;


public class Node {
    User value;
    Node left;
    Node right;


    Node(User v ){
        this.right =null;
        this.left = null;   
        this.value=v;
    }
}