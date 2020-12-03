package com.adventofcode.day3;

public class Row {

    private final String treeData;

    public Row(String input) {
        treeData = input;
    }

    public boolean isTree(int index) {
        return treeData.charAt(index % treeData.length()) == '#';
    }

}
