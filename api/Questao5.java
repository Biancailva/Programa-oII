package api;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Questao5 {
    public static void main(String[] args) {
        // HashSet - ordem não garantida
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Zebra");
        hashSet.add("Abacaxi");
        hashSet.add("Casa");
        hashSet.add("Mesa");

        System.out.println("HashSet (ordem não garantida): " + hashSet);

        // TreeSet - ordem natural (alfabética)
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Abacaxi");
        treeSet.add("Casa");
        treeSet.add("Mesa");

        System.out.println("TreeSet (ordem natural): " + treeSet);
    }
}
