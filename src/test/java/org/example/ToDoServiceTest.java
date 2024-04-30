package org.example;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceTest implements ToDoService {

    @Override
    public List<String> getTodos(String user) {
        return Arrays.asList("Use Core Java", "Use Spring Core", "Use Hibernate", "Use Spring MVC");
    }
}