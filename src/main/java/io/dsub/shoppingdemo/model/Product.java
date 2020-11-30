package io.dsub.shoppingdemo.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@EntityListeners(value = {AuditingEntityListener.class})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String image;
    private Integer price;

    /* SHOULD match the var name on the ProductReview class!!! */
    @OneToMany(mappedBy = "product")
    private List<ProductReview> reviews;


    /* prevent get list for each query -- performance issue */
    private byte avgProductScore;
    private byte avgDeliveryScore;
    private Long reviewCount;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;
}
