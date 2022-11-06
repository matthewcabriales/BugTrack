package com.example.demo.appuser;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional

public interface AppUserRepo {

    Optional<AppUser> findByEmail(String email);
}
