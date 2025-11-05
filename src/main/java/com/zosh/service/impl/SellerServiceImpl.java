package com.zosh.service.impl;

import com.zosh.domain.AccountStatus;
import com.zosh.modal.Seller;
import com.zosh.service.SellerService;

import java.util.List;

public class SellerServiceImpl implements SellerService {
    @Override
    public Seller getSellerProfile(String jwt) {
        return null;
    }

    @Override
    public Seller createSeller(Seller seller) {
        return null;
    }

    @Override
    public Seller getSellerById(Long id) {
        return null;
    }

    @Override
    public Seller getSellerByEmail(String email) {
        return null;
    }

    @Override
    public List<Seller> getAllSellers(AccountStatus status) {
        return List.of();
    }

    @Override
    public Seller updateSeller(Long id, Seller seller) {
        return null;
    }

    @Override
    public void deleteSeller(Long id) {

    }

    @Override
    public Seller verifyEmail(String email, String otp) {
        return null;
    }

    @Override
    public Seller updateSellerAccountStatus(Long sellerId, AccountStatus status) {
        return null;
    }
}
