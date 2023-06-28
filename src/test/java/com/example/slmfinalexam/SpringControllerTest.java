package com.example.slmfinalexam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpringControllerTest {
    @Test
    void modify_lower_case(){
        SpringController controller = new SpringController();
        String result = controller.modify("hello");
        assertEquals("hElLo",result);
    }

    @Test
    void modify_all_upper_case(){
        SpringController controller = new SpringController();
        String result = controller.modify("HELLO");
        assertEquals("hElLo",result);
    }

    @Test
    void modify_mixed_case(){
        SpringController controller = new SpringController();
        String result = controller.modify("heLLo");
        assertEquals("hElLo",result);
    }

    @Test
    void length_with_message(){
        SpringController controller = new SpringController();
        controller.modify("heLLo");
        int result = controller.getLength();
        assertEquals(5,result);
    }

    @Test
    void length_without_message(){
        SpringController controller = new SpringController();
        int result = controller.getLength();
        assertEquals(0,result);
    }
}