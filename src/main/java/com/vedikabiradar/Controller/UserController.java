package com.vedikabiradar.Controller;

import com.vedikabiradar.UserOperationsHQL.UserOperationsHQL;
import com.vedikabiradar.model.UserOperations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserController {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

//         UserOperations.addUser(factory,session);

//        UserOperations.findUser(factory,session,3);
//
//        UserOperations.updateUser(session,3);
//
//        UserOperations.deleteUser(session,4);

//        UserOperationsHQL.findUserHql(factory,session);

//        UserOperationsHQL.getRecordById(factory,session);

//        UserOperationsHQL.getRecords(session);

//        UserOperationsHQL.getMaxSalary(session);

//        UserOperationsHQL.getmaxSalaryGroupBy();
        UserOperationsHQL.namedQueryExample(session);
        factory.close();
        session.close();
    }
}
