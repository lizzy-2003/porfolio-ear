package com.portfolio.ear.UserRepositoryTest;

//test para crear usuario
//Archivo UserRepositoryTest.java

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package com.portfolio.mds.UserRepositoryTest;

import com.portfolio.mds.Security.Entity.Usuario;
import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

 
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    @Autowired
    Usuario Repo;
    
    @Test
    public void testCreateUser(){
        PasswordEncoder passwordEncoder = new BCryptPassword();
		String rawPassword = "123456";
		String encodePassword= passwordEncoder.encode(rawPassword);
		User newUser = new User(email: "mail@mail.com",encodePassword);
		User savedUser = Repo.save(newUser);
		assertThat(savedUser).isNotNull();
		assertThat(savedUser.getId()).isGreaterThan(0);
}
*/