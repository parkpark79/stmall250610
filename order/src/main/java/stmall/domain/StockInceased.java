package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class StockInceased extends AbstractEvent {

    private Long id;
    private String name;
    private Integer stock;
}
