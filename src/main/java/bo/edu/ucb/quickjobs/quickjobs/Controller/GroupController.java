package bo.edu.ucb.quickjobs.quickjobs.Controller;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.GroupEntity;
import bo.edu.ucb.quickjobs.quickjobs.Service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/groups")
public class GroupController {

    private final GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService){
        this.groupService = groupService;
    }
    //1. Obtener todos los grupos
    @GetMapping
    public ResponseEntity<List<GroupEntity>> getAll(){
        return ResponseEntity.ok(this.groupService.getAll());
    }

    //2.Obtnener un grupo por su id
    @GetMapping("/{groupId}")
    public ResponseEntity<GroupEntity> get(@PathVariable Long groupId){
        return ResponseEntity.ok(this.groupService.get(groupId));
    }

    //3. Agregar un grupo
    @PostMapping
    public ResponseEntity<GroupEntity> add(@RequestBody GroupEntity group){
        if (group.getIdGroup() == null || !this.groupService.exists(group.getIdGroup())){
            return ResponseEntity.ok(this.groupService.save(group));
        }
        else {
            return ResponseEntity.badRequest().build();
        }
    }

    //4. Actualizar un grupo
    @PutMapping
    public ResponseEntity<GroupEntity> update(@RequestBody GroupEntity group){
        if (group.getIdGroup() == null || !this.groupService.exists(group.getIdGroup())){
            return ResponseEntity.ok(this.groupService.save(group));
        }
        else {
            return ResponseEntity.badRequest().build();
        }
    }

    //5. Eliminar un grupo
    @DeleteMapping("/{groupId}")
    public ResponseEntity<Void> delete(@PathVariable Long groupId){
        if (this.groupService.exists(groupId)){
            this.groupService.delete(groupId);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.badRequest().build();
        }
    }




}
