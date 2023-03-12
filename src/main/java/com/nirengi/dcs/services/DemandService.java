package com.nirengi.dcs.services;

import com.nirengi.dcs.data.entity.DemandEntity;
import com.nirengi.dcs.dto.DemandDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface DemandService {

    public List<DemandDto> getAllDemands();

    public List<DemandDto> getReceivedDemandsByUserId(Long id);
    public List<DemandDto> getTransceivedDemandsByUserId(Long id);
    public DemandDto createDemand(DemandDto demandDto);
    public ResponseEntity<DemandDto> getDemandById(Long id);

    public ResponseEntity<DemandDto> updateDemand(Long id, DemandDto demandDto) throws Throwable;
    public  ResponseEntity<Map<String,Boolean>> deleteDemand(Long id) throws Throwable;

    //Model Wrapper
    public  DemandDto entityToDto(DemandEntity demandEntity);
    public  DemandEntity dtoToEntity(DemandDto demandDto);
}
