package com.example.slmfinalexam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    private int length = 0;

    @RequestMapping("/modify")
    public String modify(@RequestParam String string){
        this.length = string.length();
        String output = "";
        for(int i = 0; i < this.length;i++){
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

    @RequestMapping("/modify/length")
    public int getLength(){
        return this.length;
    }

}
