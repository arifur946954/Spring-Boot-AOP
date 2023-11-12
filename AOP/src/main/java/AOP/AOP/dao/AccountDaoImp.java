package AOP.AOP.dao;

import org.springframework.stereotype.Repository;

@Repository

public class AccountDaoImp implements AccountDao{
    @Override
    public void addAccount() {
        System.out.println(getClass() +" Adding my Account So Dont worry about it");

    }
}
