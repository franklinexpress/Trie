package com.tic.franklin;

/**
 * Created by franklin on 6/1/17.
 */
public class Trie {
    private Node root;

    public Trie() {
        this.root = new Node("");
    }

    public void insert(String word) {
        Node tempNode = root;

        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            int asciiIndex = c - 'a';

            if (tempNode.getChild(asciiIndex) == null) {
                    Node node = new Node(String.valueOf(c));
                    tempNode.setChild(asciiIndex, node);
                    tempNode = node;
            } else {
                tempNode = tempNode.getChild(asciiIndex);
            }
        }
        tempNode.setLeaf(true);
    }

    public boolean search(String word) {

    }
}
