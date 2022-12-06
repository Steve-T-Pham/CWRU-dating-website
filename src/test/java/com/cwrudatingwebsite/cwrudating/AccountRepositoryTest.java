package com.cwrudatingwebsite.cwrudating;

import static org.assertj.core.api.Assertions.assertThat;
 
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

	@Test
	public void testCreateAccount() {
		Account testAccount = new Account();
		testAccount.setUsername("testUsername");
		testAccount.setEmail("test@case.edu");
		testAccount.setPassword("passwordtest");
		testAccount.setFirstName("Test");
		testAccount.setLastName("Person");
		 
		Account savedUser = repo.save(testAccount);
		 
		Account existUser = entityManager.find(Account.class, savedUser.getId());
		 
		assertThat(testAccount.getEmail()).isEqualTo(existUser.getEmail());
	}
}