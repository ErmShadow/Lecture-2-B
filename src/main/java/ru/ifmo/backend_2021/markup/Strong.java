package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends toMarkdown{
    public Strong(List<Mark> list) {
        super(list, "__");
    }
}