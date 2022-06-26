package com.bridgeLabz;

import java.util.Scanner;

/**
 * Creating Node Class......................
 */

class Node {
    static int data;
    Node Right;
    Node Left;

    /**
     * Creating Constructor.........................
     */
    public Node(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        binaryTree.createTree();
    }

    public class binaryTree {

        public static Node createTree() {
            Scanner scanner = null;
            Scanner Scanner = new Scanner(System.in);
            Node root = null;
            System.out.println("Enter data:");
            int data = Scanner.nextInt();
            if (data == -1) return root;
            root = new Node(data);
            System.out.println("Enter left for " + data);
            root.Left = createTree();
            System.out.println(" Enter right for" + data);
            root.Right = createTree();

            return root;
        }
    }

}
