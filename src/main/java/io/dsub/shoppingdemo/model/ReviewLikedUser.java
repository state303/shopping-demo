package io.dsub.shoppingdemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ReviewLikedUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_review_id")
    private ProductReview productReview;
}
