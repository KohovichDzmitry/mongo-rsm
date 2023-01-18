package app.service;

import app.entity.ObjectsTemp;

import java.util.List;

public interface ObjectsTempService {

    Integer countObjectsTempByStereotype(String stereotype);

    List<ObjectsTemp> findAllByStereotype(String stereotype);

    List<ObjectsTemp> findAllBySparxTagsIsNull();

    List<String> findDistinctByStatus();

    List<ObjectsTemp> findAllByStatusAndGuidParentIsNull(String status);

    List<ObjectsTemp> findAllByNameLike();
}
