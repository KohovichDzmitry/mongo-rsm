package app.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document("objects_temp")
public class ObjectsTemp {

    @Id
    private ObjectId _id;
    private String _class;
    private String archSA;
    private String author;
    private Integer change;
    private String description;
    private String folder;
    private ObjectId idRSM;
    private String name;
    private List<Object> sparxErrorLest;
    private List<Object> sparxTags;
    private String status;
    private Object[] stereotypes;
    private String sysCreated;
    private String authorStereotype;
    private Boolean checkParentValidation;
    private String guidSparx;
}
