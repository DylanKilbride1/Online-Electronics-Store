package com.assignment.softwarepatterns.repositories;

import com.assignment.softwarepatterns.models.Administrator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends CrudRepository <Administrator, Long> {

	boolean existsByEmailAndPassword(String email, String password);
	Administrator findAdministratorByEmail(String email);
	Administrator findAdministratorByAdminId(long adminId);
}
