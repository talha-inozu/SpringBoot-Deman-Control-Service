package com.nirengi.dcs.controller;

import com.nirengi.dcs.dto.DemandDto;
import com.nirengi.dcs.services.DemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DemandServiceController {

    @Autowired
    DemandService demandService;




    @RequestMapping(value = "/demands",method = RequestMethod.GET)
    public List<DemandDto> getAllDemands(){
        return  demandService.getAllDemands();
    }


}
