package com.tiy.weekthree.assignmentfour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Node implements Text9Trie {

    
    private class Node2 {
        public Node parent;
        public Boolean endOfWord = false; 
        public HashMap<Character,Node> children = new HashMap<Character,Node>();
    }
    
    private Node parent;
    private Node[] children;
    private boolean isLeaf; 
    private boolean isWord; 
    private char character; 
    
    public Node() {
        children = new Node[26];
        isLeaf = true;
        isWord = false;
    }

    
    public Node(char character) {
        this();
        this.character = character;
    }

    
    //add word to node        
    public void addWord(String word) {
        isLeaf = false;
        int charPos = word.charAt(0);

        if (children[charPos] == null) {
            children[charPos] = new Node(word.charAt(0));
            children[charPos].parent = this;
        }

        if (word.length() > 1) {
            children[charPos].addWord(word.substring(1));
        } else {
            children[charPos].isWord = true;
        }
    }


    public Node getNode(char c) {
        return children[c];
    }

       
    public List getWords() {
        
        List list = new ArrayList();

        if (isWord) {
            list.add(toString());
        }

        
        if (!isLeaf) {
            for (int i = 0; i < children.length; i++) {
                if (children[i] != null) {
                    list.addAll(children[i].getWords());
                }
            }
        }
        return list;
    }



    public String toString()
    {
        if (parent == null)
        {
            return "";
        } else
        {
            return parent.toString() + new String(new char[] {character});
        }
    }

    @Override
    public boolean contains(String word) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remove(String word) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<String> suggest(String digits) {
        // TODO Auto-generated method stub
        return null;
    }

}
