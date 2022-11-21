package deliveryedit.domain;

import deliveryedit.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class Paid extends AbstractEvent {

    private Long id;
    private Long orderId;
}
