package com.example.demo.model;

import org.springframework.cloud.gcp.data.spanner.core.mapping.*;
import lombok.Data;
import java.time.LocalDateTime;

@Table(name="orders")
@Data

public class Orders {
    @PrimaryKey
    @Column(name="order_id")
    private String order_id;
    @Column(name="description")
    private String description;
    @Column(name="creation_timestamp")
    private LocalDateTime timestamp;
}
