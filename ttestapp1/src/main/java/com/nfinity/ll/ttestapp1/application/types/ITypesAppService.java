package com.nfinity.ll.ttestapp1.application.types;

import java.util.List;
import javax.validation.constraints.Positive;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.nfinity.ll.ttestapp1.commons.search.SearchCriteria;
import com.nfinity.ll.ttestapp1.application.types.dto.*;

@Service
public interface ITypesAppService {

	CreateTypesOutput create(CreateTypesInput types);

    void delete(Integer id);

    UpdateTypesOutput update(Integer id, UpdateTypesInput input);

    FindTypesByIdOutput findById(Integer id);

    List<FindTypesByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

}
