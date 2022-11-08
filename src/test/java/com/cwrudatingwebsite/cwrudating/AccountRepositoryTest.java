package com.cwrudatingwebsite.cwrudating;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.cwrudatingwebsite.Account;
import com.cwrudatingwebsite.AccountRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class AccountRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private AccountRepository repo;
	
	/* 
	@Test
	public void testCreateUser() {
		Account user = new Account("testUsername", "ravi2020", "ravikumar@gmail.com", "Ravi", "Kumar");
		
		Account savedUser = repo.save(user);
		
		Account existUser = entityManager.find(Account.class, savedUser.getId());
		
		assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
		
	}*/
	
    
    /*
	@Test
	public void testFindByEmail() {
		String email = "nam@codejava.net";
		Account user = repo.findByEmail(email);
		
		assertThat(user.getEmail()).isEqualTo(email);
	} */
}