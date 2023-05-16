package abc.domain;

import abc.BoundedContext312Application;
import abc.domain.Evented;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Abc_table")
@Data
public class Abc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String status;

    @PostPersist
    public void onPostPersist() {
        Evented evented = new Evented(this);
        evented.publishAfterCommit();
    }

    public static AbcRepository repository() {
        AbcRepository abcRepository = BoundedContext312Application.applicationContext.getBean(
            AbcRepository.class
        );
        return abcRepository;
    }
}
