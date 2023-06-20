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

    //1. Obtener todos los grupos
    public List<GroupEntity> getAll(){
        return this.groupRepository.findAll();
    }

    //2. Obtener un grupo por su id
    public GroupEntity get(Long groupId){
        return this.groupRepository.findById(groupId).orElseThrow();
    }

    //3. agregar un grupo
    public GroupEntity save(GroupEntity group){
        return this.groupRepository.save(group);
    }
    //4. Verificar si existe un grupo
    public boolean exists(Long groupId){
        return this.groupRepository.existsById(groupId);
    }

    //5. Eliminar un grupo
    public void delete(Long groupId){
        this.groupRepository.deleteById(groupId);
    }
}
