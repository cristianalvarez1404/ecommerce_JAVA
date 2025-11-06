package com.zosh.controller;

import com.zosh.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SellerController {
    private final SellerService sellerService;




}
