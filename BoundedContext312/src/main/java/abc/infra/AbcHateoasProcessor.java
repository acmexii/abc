package abc.infra;

import abc.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AbcHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Abc>> {

    @Override
    public EntityModel<Abc> process(EntityModel<Abc> model) {
        return model;
    }
}
