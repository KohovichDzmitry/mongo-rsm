package app.repository;

import app.entity.ObjectsTemp;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ObjectsTempRepository extends MongoRepository<ObjectsTemp, ObjectId> {

    @Query("{stereotypes: '?0'}")
    Integer countObjectsTempByStereotype(String stereotypes);

    @Query("{stereotypes: '?0'}")
    List<ObjectsTemp> findAllByStereotype(String stereotype);

    List<ObjectsTemp> findAllBySparxTagsIsNull();

    List<String> findDistinctByStatus();

    @Query("{status: '?0'}")
    List<ObjectsTemp> findAllByStatusAndGuidParentIsNull(String status);

    @Query("{name:{$regex:'EQ.'}}")
    List<ObjectsTemp> findAllByNameLike();
}
