package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.CountryDTO;

public interface CountryService {

    public CountryDTO addCountry(CountryDTO countryDTO);

    public CountryDTO getCountryById(Long countryId);

    public CountryDTO updateCountry(Long countryId, CountryDTO countryRequest);

    public void deleteCountry(Long countryId);
}
