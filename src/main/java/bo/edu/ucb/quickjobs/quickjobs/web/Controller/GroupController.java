package bo.edu.ucb.quickjobs.quickjobs.web.Controller;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.GroupEntity;
import bo.edu.ucb.quickjobs.quickjobs.Service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/groups")
public class GroupController {

    private final GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService){
        this.groupService = groupService;
    }

    @GetMapping
    public ResponseEntity<List<GroupEntity>> getAll(){
        return ResponseEntity.ok(this.groupService.getAll());
    }

    public ResponseEntity<GroupEntity> add(@RequestBody GroupEntity group){
        if(group.getIdGroup()== null || !this.groupService.exists(group.getIdGroup())){
            return ResponseEntity.ok(this.groupService.save(group));
        }
        else {
            return ResponseEntity.badRequest().build();
        }
    }


}
