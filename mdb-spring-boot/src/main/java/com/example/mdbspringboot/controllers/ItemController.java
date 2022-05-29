package com.example.mdbspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
@RestController
@RequestMapping(value = "/api")
public class ItemController 
{
	 @GetMapping(path="/", produces = "application/json")
	    public String getStudentList()
	    {
	        return "Hello";
	    }
}