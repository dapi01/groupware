package org.codenova.groupwareback.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Employee writer;


    private String title;
    private String content;
    private Integer viewCount;

    private LocalDateTime wroteAt;
}
