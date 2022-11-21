package deliveryedit.domain;

import deliveryedit.domain.*;
import deliveryedit.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Delivered extends AbstractEvent {

    private Long id;
    private Long orderId;
}


