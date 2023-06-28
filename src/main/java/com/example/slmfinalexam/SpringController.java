package com.example.slmfinalexam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @RequestMapping("/modify")
    public String modify(@RequestParam String string){
        String output = "";
        for(int i = 0; i < string.length();i++){
             String new_value = String.valueOf(string.charAt(i));
             if (i%2 == 0){
                 output = output+new_value.toLowerCase();
             }
             else{
                 output = output+new_value.toUpperCase();
             }
         }
        return output;
    }

}
