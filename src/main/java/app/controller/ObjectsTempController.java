package app.controller;

import app.entity.ObjectsTemp;
import app.service.ObjectsTempService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/objects-temp")
@RequiredArgsConstructor
public class ObjectsTempController {

    private final ObjectsTempService service;

    @GetMapping("/count/{stereotype}")
    public ResponseEntity<Integer> countObjectsTempByStereotype(@PathVariable String stereotype) {
        return ResponseEntity.ok(service.countObjectsTempByStereotype(stereotype));
    }

    @GetMapping("/{stereotype}")
    public ResponseEntity<List<ObjectsTemp>> findAllByStereotype(@PathVariable String stereotype) {
        return ResponseEntity.ok(service.findAllByStereotype(stereotype));
    }

    @GetMapping("/sparxTagsIsNull")
    public ResponseEntity<List<ObjectsTemp>> findAllBySparxTagsIsNull() {
        return ResponseEntity.ok(service.findAllBySparxTagsIsNull());
    }

    @GetMapping("/distinctStatus")
    public ResponseEntity<List<String>> findDistinctByStatus() {
        return ResponseEntity.ok(service.findDistinctByStatus());
    }

    @GetMapping("/statusAndGuidParentIsNull/{status}")
    public ResponseEntity<List<ObjectsTemp>> findAllByStatusAndGuidParentIsNull(@PathVariable String status) {
        return ResponseEntity.ok(service.findAllByStatusAndGuidParentIsNull(status));
    }

    @GetMapping("/nameLike")
    public ResponseEntity<List<ObjectsTemp>> findAllByNameLike() {
        return ResponseEntity.ok(service.findAllByNameLike());
    }
}
