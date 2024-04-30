package org.example;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {

    public ToDoService doService;

    public ToDoBusiness(ToDoService doService) {
        this.doService = doService;
    }

    public List<String> getTodosForHibernate(String user) {

        List<String> hibernateList = new ArrayList<String>();
        List<String> combinedList = doService.getTodos(user);

        for(String todo:combinedList) {
            if(todo.contains("Hibernate")) {
                hibernateList.add(todo);
            }
        }
        return hibernateList;
    }
}
