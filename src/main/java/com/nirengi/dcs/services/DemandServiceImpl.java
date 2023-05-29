package com.nirengi.dcs.services;

import com.nirengi.dcs.data.entity.DemandEntity;
import com.nirengi.dcs.data.repository.DemandRepository;
import com.nirengi.dcs.data.repository.UserRepository;
import com.nirengi.dcs.dto.DemandDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


@Service
public class DemandServiceImpl implements DemandService{

    @Autowired
    DemandRepository demandRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<DemandDto> getAllDemands() {
    List<DemandDto> responseList = new ArrayList<>();

    Iterable<DemandEntity> entities = demandRepository.findAll();

    for(DemandEntity entity:entities){
        responseList.add(entityToDto(entity));
    }
        return responseList ;
    }

    @Override
    public List<DemandDto> getReceivedDemandsByUserId(Long id) {
        List<DemandDto> responseList = new ArrayList<>();
        Iterable<DemandEntity> entities = demandRepository.findAll();

        for(DemandEntity entity:entities){
            if(entity.getReceiverId() == id)
                responseList.add(entityToDto(entity));
        }

        return responseList ;

    }

    @Override
    public List<DemandDto> getTransceivedDemandsByUserId(Long id) {
        return null;
    }

    @Override
    public DemandDto createDemand(DemandDto demandDto) {
        return null;
    }

    @Override
    public ResponseEntity<DemandDto> getDemandById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DemandDto> updateDemand(Long id, DemandDto demandDto) throws Throwable {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deleteDemand(Long id) throws Throwable {
        return null;
    }

    @Override
    public DemandDto entityToDto(DemandEntity demandEntity) {
        DemandDto responseDto = modelMapper.map(demandEntity,DemandDto.class);
        return responseDto;
    }

    @Override
    public DemandEntity dtoToEntity(DemandDto demandDto) {



        return null;
    }
}
