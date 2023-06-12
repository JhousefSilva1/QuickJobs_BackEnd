package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.RolDTO;

public interface RolService {

    public RolDTO addRol(RolDTO rolDTO);

    public RolDTO getRolById(Long rolId);

    public RolDTO updateRol(Long rolId, RolDTO rolRequest);

    public void deleteRol(Long rolId);
}
