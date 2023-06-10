package bo.edu.ucb.quickjobs.quickjobs.dao;

import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface PersonDao  {

    @Select("""
            select qj_person_id_person, qj_person_names, qj_person_surnames, qj_person_born, qj_person_dni, qj_person_email,
            qj_person_email, qj_person_imageprofile, qj_person_cellphone, qj_person_status, qj_person_version,
            qj_person_tx_user, qj_person_tx_host, qj_person_tx_date, qj_person_username, qj_person_password
            from qj_person
            WHERE
                qj_person_id_person = #{personId}
                AND qj_person_status = true
            
            """)
    Person findByPersonId(Long personId);

    @Select("""
            select qj_person_passwrod
            from qj_person
            WHERE
                qj_person_username= #{username}
                AND qj_person_status = true
            """)
     String findByPaswordByUsername(String username);

    @Select("""
            select qj_person_id_person, qj_person_names, qj_person_surnames, qj_person_born, qj_person_dni, qj_person_email,
            qj_person_email, qj_person_imageprofile, qj_person_cellphone, qj_person_status, qj_person_version,
            qj_person_tx_user, qj_person_tx_host, qj_person_tx_date, qj_person_username, qj_person_password
            from qj_person
            WHERE
                qj_person_username = #{username}
                AND qj_person_status = true
            """)
    Person findByUsername(String username);



    void createPerson( Person person);

}
