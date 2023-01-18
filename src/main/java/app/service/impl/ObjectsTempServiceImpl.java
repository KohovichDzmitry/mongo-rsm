package app.service.impl;

import app.entity.ObjectsTemp;
import app.repository.ObjectsTempRepository;
import app.service.ObjectsTempService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ObjectsTempServiceImpl implements ObjectsTempService {

    private final ObjectsTempRepository repository;

    @Override
    public Integer countObjectsTempByStereotype(String stereotype) {
        return repository.countObjectsTempByStereotype(stereotype);
    }

    @Override
    public List<ObjectsTemp> findAllByStereotype(String stereotype) {
        return repository.findAllByStereotype(stereotype);
    }

    @Override
    public List<ObjectsTemp> findAllBySparxTagsIsNull() {
        return repository.findAllBySparxTagsIsNull();
    }

    @Override
    public List<String> findDistinctByStatus() {
        return repository.findDistinctByStatus();
    }

    @Override
    public List<ObjectsTemp> findAllByStatusAndGuidParentIsNull(String status) {
        return repository.findAllByStatusAndGuidParentIsNull(status);
    }

    @Override
    public List<ObjectsTemp> findAllByNameLike() {
        return repository.findAllByNameLike();
    }
}
