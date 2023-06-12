package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.GroupPersonDTO;

public interface GroupPersonService {

    public GroupPersonDTO addGroupPerson(long groupId, long personId);

    public GroupPersonDTO getGroupPersonById(Long groupPersonId);

    public GroupPersonDTO updateGroupPerson(Long groupPersonId, GroupPersonDTO groupPersonRequest);

    public void deleteGroupPerson(Long groupPersonId);

}
