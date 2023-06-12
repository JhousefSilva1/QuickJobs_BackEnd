package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.CityDTO;

public interface CityService {

    public CityDTO addCity(CityDTO cityDTO);

    public CityDTO getCityById(Long cityId);

    public CityDTO updateCity(Long cityId, CityDTO cityRequest);

    public void deleteCity(Long cityId);
}
