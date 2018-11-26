package com.company;

import java.util.ArrayList;

public class Node {
    private Person husband;
    private Person wife;
    private ArrayList<Node> children;
    SortStrategy st;
    public Node() {
        children = new ArrayList<>();
        this.husband = null;
        this.wife = null;
    }
    public void setSortStrategy(SortStrategy st) {
        this.st = st;
    }
    public void addHusband(Person husband) {
        this.husband = husband;
    }

    public void addWife(Person wife) {
        this.wife = wife;
    }

    public void addChild(Node child) {
        children.add(child);
    }


    public void printHierachy() {
        String husbandName = (husband != null) ? husband.getName() : "Not marry";
        String wifeName = (wife != null) ? wife.getName() : "Not marry";
        System.out.println(husbandName + " " + wifeName + "\n");

        for(int i = 0; i < children.size(); i++) {
            children.get(i).printHierachy();
        }
    }

    public void findNotMarry() {
        if(husband != null && !husband.isMarried()) System.out.println(husband.getName());
        if(wife != null && !wife.isMarried()) System.out.println(wife.getName());

        for(int i = 0; i < children.size(); i++) {
            children.get(i).findNotMarry();
        }
    }

    public void findTwoChildren() {
        if(husband != null && husband.isMarried && this.children.size() == 2) {
            System.out.println(husband.getName() + " " + wife.getName());
        }
        for(int i = 0; i < children.size(); i++) {
            children.get(i).findTwoChildren();
        }
    }

    public void findNewMember() {
        if(this.children.size() == 0) {
            String husbandName = (husband != null) ? husband.getName() : "";
            String wifeName = (wife != null) ? wife.getName() : "";
            System.out.println(husbandName + " " + wifeName);
        }
        for(int i = 0; i < children.size(); i++) {
            children.get(i).findNewMember();
        }
    }

    public void sort(int[] arr) {
        st.sort(arr);
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
