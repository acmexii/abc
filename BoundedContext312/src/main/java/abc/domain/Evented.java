package abc.domain;

import abc.domain.*;
import abc.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Evented extends AbstractEvent {

    private Long id;

    public Evented(Abc aggregate) {
        super(aggregate);
    }

    public Evented() {
        super();
    }
}
