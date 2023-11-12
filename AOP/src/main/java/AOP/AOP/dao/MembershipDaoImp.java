package AOP.AOP.dao;

import org.springframework.stereotype.Repository;

@Repository

public class MembershipDaoImp implements MembershipDao{
    @Override
    public void addAccount() {
        System.out.println(getClass() +" Adding my Account So This is MemberShipo");

    }
}
