package com.nirengi.dcs.data.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

@Entity
@Table(name = "demands")
public class DemandEntity extends BaseEntity implements Serializable {
    @Column(name = "transceiverId")
    private String transceiverId;
    @Column(name = "receiverId")
    private String receiverId;
    @Column(name = "demandDescription")
    private String demandDescription;
    @Column(name = "demandTitle")
    private String demandTitle;
    @Column(name = "isDone")
    private Boolean isDone;
    @Column(name = "transcevieDateTime")
    private String transcevieDateTime;





}
