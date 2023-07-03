package com.rhd.springwebappexample.resources;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainResourceTest {
    
    @Test
    public void shouldReturnStringWhenExecuted(){
        assertEquals("Pro meu Amigo Tenente!", new MainResource().isWorking());
    }
}
