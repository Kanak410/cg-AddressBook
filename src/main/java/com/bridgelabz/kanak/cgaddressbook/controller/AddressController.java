package com.bridgelabz.kanak.cgaddressbook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v")
public class AddressController {
    @GetMapping()
    public String getAddresses() {
        return "List of addresses";
    }
    @GetMapping("{id}")
    public String getAddress(@PathVariable Long id) {
        return "Address with id " + id;
    }
    @PostMapping("/add")
    public String addAddress() {
        return "Successfully added the address of id" ;
    }
    @PutMapping("update/{id}")
    public String updateAddress(@PathVariable Long id) {
        return "Successfully updated the address of id" + id;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAddress(@PathVariable Long id) {
        return "Sucessfully deleted the address"+id;
    }

}
