package deliveryedit.domain;

import deliveryedit.domain.*;
import deliveryedit.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String address;
    private Long orderId;
}


