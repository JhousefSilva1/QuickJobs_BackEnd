package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.GroupDTO;

public interface GroupService {

        public GroupDTO addGroup(GroupDTO groupDTO);

        public GroupDTO getGroupById(Long groupId);

        public GroupDTO updateGroup(Long groupId, GroupDTO groupRequest);

        public void deleteGroup(Long groupId);



}
