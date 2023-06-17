package bo.edu.ucb.quickjobs.quickjobs.Service;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.dao.GroupRepository;
import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.GroupEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    private final GroupRepository groupRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }
    //Obtener todos los grupos
    public List<GroupEntity> getAll(){
        return this.groupRepository.findAll();
    }

    public GroupEntity save(GroupEntity group){
        return this.groupRepository.save(group);
    }

    public boolean exists(Long groupId){
        return this.groupRepository.existsById(groupId);
    }
}
