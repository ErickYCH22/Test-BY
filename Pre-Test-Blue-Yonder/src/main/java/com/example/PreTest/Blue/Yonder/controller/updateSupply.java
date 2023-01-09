package com.example.PreTest.Blue.Yonder.controller;

import com.example.PreTest.Blue.Yonder.model.supply;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class updateSupply {

    @RequestMapping(value = "updateSupply")
    public List<supply> getsupply(){
        List<supply> supplyList = new ArrayList<>();
        supply sup = new supply();
        sup.setId("product" + 1);
        sup.setDate(LocalDate.of(2019,2,22));
        sup.setQuantity(7.0);
        sup.setStatus("good");

        supplyList.add(sup);
        return supplyList;

    }
}


