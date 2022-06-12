package com.ms10.springbootmcpurchase.repository;
import com.ms10.springbootmcpurchase.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface PurchaseRepository extends JpaRepository<Purchase, Long>
{
    List<Purchase> findAllByUserId(Long userId);
}
