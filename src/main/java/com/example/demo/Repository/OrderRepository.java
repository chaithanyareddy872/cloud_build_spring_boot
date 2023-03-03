package com.example.demo.Repository;

import org.springframework.cloud.gcp.data.spanner.repository.SpannerRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends SpannerRepository<Order, String> {
    
}
