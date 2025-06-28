package miniproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import miniproject.domain.*;
import miniproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class WriterRequest extends AbstractEvent {

    private Long userId;

    public WriterRequest(User aggregate) {
        super(aggregate);
    }

    public WriterRequest() {
        super();
    }
}
//>>> DDD / Domain Event
