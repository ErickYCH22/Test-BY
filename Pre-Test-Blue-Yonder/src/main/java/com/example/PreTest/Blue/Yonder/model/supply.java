package com.example.PreTest.Blue.Yonder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class supply {
    private String id;
    private LocalDate date;
    private Double quantity;
    private String status;

}