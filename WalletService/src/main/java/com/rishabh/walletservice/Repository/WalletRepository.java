package com.rishabh.walletservice.Repository;

import com.rishabh.walletservice.Model.User;
import com.rishabh.walletservice.Model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {

    @Query("SELECT w FROM Wallet w WHERE w.user_id = ?1")
    Wallet findWalletByUserId(int userId);
}