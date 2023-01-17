package app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.bson.types.ObjectId;

import java.util.List;

@Entity
@Data
public class ObjectsTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
