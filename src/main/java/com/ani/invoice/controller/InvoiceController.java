package com.ani.invoice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/invoice")
@RestController
public class InvoiceController {

    @GetMapping
    public ResponseEntity<String> getInvoice() {
        return ResponseEntity.ok("it is invoice");
    }
}
