package com.arin.task.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arin.task.dto.PostRequestBodyDto;

@RestController
@RequestMapping("api/v1")
public class MainController {

    @PostMapping("task")
    public String postMetod(@RequestBody PostRequestBodyDto requestBody){
        
        return "일정이름 : " +  requestBody.getName() + "카테고리 : " + requestBody.getCategory() + 
        "설명 : " + requestBody.getText() + "날짜 : " + requestBody.getDate() + "시간 : " + requestBody.getTime();
    }

    @GetMapping("/task/{taskNumber}")
    public String getPathVariable(
        @PathVariable("taskNumber")String taskNumber 
    ){
        return "Parameter value : " + taskNumber;
    }

    @PatchMapping("/task/{taskNumber}")
    public String PatchMetod(@RequestBody PostRequestBodyDto requestBody){
       return "일정이름 : " +  requestBody.getName() + "카테고리 : " + requestBody.getCategory() + 
        "설명 : " + requestBody.getText() + "날짜 : " + requestBody.getDate() + "시간 : " + requestBody.getTime();
    }

    @DeleteMapping("/task/{taskNumber}")
    public String DeleteMethod(){
        return "This method is Delete method";
    }
}