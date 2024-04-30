package org.example;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class ToDoBusinessTest{

    @Test
    public void test() {

        ToDoService doService = mock(ToDoService.class);

        List<String> combinedList = Arrays.asList("Use Core Java", "Use Spring Core", "Use Hibernate", "Use Spring MVC");
        when(doService.getTodos("dummy")).thenReturn(combinedList);

        ToDoBusiness business = new ToDoBusiness((doService));
        List<String> alltd = business.getTodosForHibernate("dummy");
        System.out.println(alltd);
        assertEquals(1, alltd.size());

    }
}