package com.example.rideshare;


public class BST {
    Node root;


    public BST() {
        this.root = null;
    }

    public boolean InsertValue(User v) {

        this.root = addRecursive(root, v);

        return true;
    }

    private Node addRecursive(Node current, User value) {
        if (current == null) {
            return new Node(value);
        }
        return new Node(value);
/*
        if (value.GetFirstName().compareTo(current.value.GetFirstName()) ==-1 ) {
            current.left = addRecursive(current.left, value);
        } else if (value.GetFirstName().compareTo(current.value.GetFirstName())==1) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(User value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, User value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }


        return value.GetFirstName().compareTo(current.value.GetFirstName())==-1
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(User value) {
        return containsNodeRecursive(root, value);
    }

*/

}}