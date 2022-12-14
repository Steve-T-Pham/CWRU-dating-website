package com.cwrudatingwebsite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    @Query("SELECT account FROM Account account WHERE account.username = ?1")
    public Account findByUsername(String username);

}