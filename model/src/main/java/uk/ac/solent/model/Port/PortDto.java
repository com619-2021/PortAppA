package uk.ac.solent.model.Port;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.ac.solent.model.base.BaseModel;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "port")
@AllArgsConstructor
@NoArgsConstructor
public class PortDto extends BaseModel {

    @Column(name = "ship", nullable = false)
    private Integer ship;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "arrival", nullable = false)
    private Date arrival;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "departure", nullable = false)
    private Date departure;

    @Column(name = "origin", nullable = false)
    private String origin;

    @Column(name = "destination", nullable = false)
    private String destination;

}
