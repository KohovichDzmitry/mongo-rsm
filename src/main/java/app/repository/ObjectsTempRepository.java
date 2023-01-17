package app.repository;

import app.entity.ObjectsTemp;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ObjectsTempRepository extends MongoRepository<ObjectsTemp, ObjectId> {

    @Query(value = "SELECT COUNT(*) FROM objects_temp WHERE stereotypes='AlfaSystem'")
    Integer findCountStereotypeBy();

    @Query(value = "SELECT * FROM objects_temp WHERE stereotypes='AlfaComponent'")
    Integer findStereotypeBy();

    Integer findAllBySparxTagsIsNull();

    Integer findDistinctByStatus();

    @Query(value = "SELECT * FROM objects_temp WHERE status='New' AND guidParent=NULL")
    Integer findAllByStatusAndGuidParent();

    @Query(value = "SELECT * FROM objects_temp WHERE name LIKE 'EQ.%'")
    Integer findAllByNameLike();
}
