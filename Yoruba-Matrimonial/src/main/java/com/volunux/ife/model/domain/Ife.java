package com.volunux.ife.model.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Ife {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedAt;

    public Ife() {
     createdAt = LocalDateTime.now();
     updatedAt = LocalDateTime.now();
    }
}
