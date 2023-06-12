package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.GroupRolDTO;

public interface GroupRolService {

    public GroupRolDTO addGroupRol(GroupRolDTO groupRolDTO);

    public GroupRolDTO getGroupRolById(Long groupRolId);

    public GroupRolDTO updateGroupRol(Long groupRolId, GroupRolDTO groupRolRequest);

    public void deleteGroupRol(Long groupRolId);


}
