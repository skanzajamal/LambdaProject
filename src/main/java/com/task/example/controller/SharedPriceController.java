package com.task.example.controller;

import com.task.example.service.SharedPriceService;
import com.task.example.model.SharedPrice;
import com.task.example.repository.SharedPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


@RestController
@RequestMapping("/stockPrices")
public class SharedPriceController {

    @Autowired
    public SharedPriceRepository sharedPriceRepository;

    @Autowired
    public SharedPriceService sharedPriceService;

    String pattern = "MM/dd/yyyy HH:mm:ss";
    DateFormat df = new SimpleDateFormat(pattern);
    List<SharedPrice> newList = new ArrayList<>();


    public SharedPriceController(SharedPriceService sharedPriceService) {
        this.sharedPriceService = sharedPriceService;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> insert(@RequestBody SharedPrice sharedPrice) throws Exception{
        try {
            SharedPrice price = sharedPriceService.insert(sharedPrice);
            return new ResponseEntity<SharedPrice>(price, HttpStatus.OK);
        } catch (Exception e) {
            throw new Exception(e.getCause());
        }
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SharedPrice> getList(){
        return sharedPriceRepository.findAll();
    }

    @Scheduled(fixedRate = 900000)
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getSharedPriceList() throws IOException {
        SharedPrice sharedPriceDto = new SharedPrice();
        List<SharedPrice> sharedPrices = sharedPriceService.getList();
        return new ResponseEntity<List<SharedPrice>>(sharedPrices, HttpStatus.OK);
    }

}
