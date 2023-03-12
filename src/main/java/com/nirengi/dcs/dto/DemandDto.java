package com.nirengi.dcs.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class DemandDto {

    private Long id;
    private String transceiverId;

    private String receiverId;

    private String demandDescription;

    private String demandTitle;

    private Boolean isDone;

    private String transcevieDateTime;




}
