package com.company;

public class Main {

    public static void main(String[] args) {
        Person james = new Person("James", 80, "male", "1930-10-10", true);
        Person hanah = new Person("Hanah", 76, "female", "1934-10-10", true);
        Person ryan = new Person("Ryan", 50, "male", "1960-03-03", false);
        Person kai = new Person("Kai", 49, "male", "1961-05-05", true);
        Person jenifer = new Person("Jenifer", 46, "female", "1964-06-06", true);
        Person jim = new Person("Jim", 11, "female", "1964-06-06", false);
        Person brian = new Person("Brain", 12, "female", "1964-06-06", false);
        Person william = new Person("William", 13, "female", "1964-06-06", false);
        Person allen = new Person("Allen", 14, "female", "1964-06-06", false);


        Node grandParents = new Node();
        grandParents.addHusband(james);
        grandParents.addWife(hanah);

        Node parents1 = new Node();
        parents1.addHusband(ryan);

        Node parents2 = new Node();
        parents2.addHusband(kai);
        parents2.addWife(jenifer);

        Node child1 = new Node();
        child1.addHusband(jim);

        Node child2 = new Node();
        child2.addWife(brian);

        Node child3 = new Node();
        child3.addHusband(william);

        Node child4 = new Node();
        child4.addHusband(allen);

        grandParents.addChild(parents1);
        grandParents.addChild(parents2);

        parents2.addChild(child1);
        parents2.addChild(child2);
        parents2.addChild(child3);
        parents2.addChild(child4);

        grandParents.printHierachy();

        grandParents.findNotMarry();

        grandParents.findTwoChildren();

        grandParents.findNewMember();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 199, 10};
        grandParents.setSortStrategy(new BubbleSortASC());
        grandParents.sort(arr.clone());
        System.out.println("---------------");
        for(int i : arr) {
            System.out.println(i);
        }
        System.out.println("---------------");
        grandParents.setSortStrategy(new SelectionSortDESC());
        grandParents.sort(arr.clone());
    }
}
