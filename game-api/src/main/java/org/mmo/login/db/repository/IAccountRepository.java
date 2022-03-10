package org.mmo.login.db.repository;

import org.mmo.login.struct.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 * 账号数据
 * @author jzy
 */
@Component
public interface IAccountRepository extends MongoRepository<Account,Long> {


    /**
     * 通过账号查询
     * @param account
     * @return
     */
    Account findByAccount(String account);
}
