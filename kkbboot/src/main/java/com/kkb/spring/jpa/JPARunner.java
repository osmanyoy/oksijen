package com.kkb.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JPARunner implements CommandLineRunner {

    @Autowired
    private IStudentDAO stDAO;

    @Override
    public void run(final String... argsParam) throws Exception {
        UniversityStudent studentLoc = new UniversityStudent();
        studentLoc.setAddr(new Address("istanbul",
                                       "besiktas"));
        studentLoc.setExtra1("extra1");
        studentLoc.setExtra2("extra2");
        studentLoc.setName("osman");
        studentLoc.setSurname("yay");
        studentLoc.setTest1("test");
        studentLoc.setUniversityName("yildiz");

        this.stDAO.save(studentLoc);

        HighSchool studentLoc2 = new HighSchool();
        studentLoc2.setAddr(new Address("istanbul",
                                        "besiktas"));
        studentLoc2.setExtra1("extra1");
        studentLoc2.setExtra2("extra2");
        studentLoc2.setName("osman");
        studentLoc2.setSurname("yay");
        studentLoc2.setHighSchoolAddr("addr1");
        studentLoc2.setHighSchoolName("highName");
        this.stDAO.save(studentLoc2);

    }

}
