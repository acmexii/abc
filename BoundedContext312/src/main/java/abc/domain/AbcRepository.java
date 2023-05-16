package abc.domain;

import abc.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "abcs", path = "abcs")
public interface AbcRepository extends PagingAndSortingRepository<Abc, Long> {}
