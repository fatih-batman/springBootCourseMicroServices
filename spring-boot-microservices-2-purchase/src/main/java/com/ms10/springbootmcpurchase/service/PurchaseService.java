package com.ms10.springbootmcpurchase.service;
import com.ms10.springbootmcpurchase.model.Purchase;
import java.util.List;
public interface PurchaseService
{
    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchasesOfUser(Long userId);
}
