package edu.act.moneytransfer.repositories;

import edu.act.moneytransfer.domains.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CRUD - Create, Read, Update, Delete

// <Class name, Data type of the ID field>
@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {}
