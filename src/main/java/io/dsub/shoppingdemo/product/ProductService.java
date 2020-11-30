package io.dsub.shoppingdemo.product;

import io.dsub.shoppingdemo.model.Product;
import io.dsub.shoppingdemo.model.ReviewLikedUser;
import io.dsub.shoppingdemo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

//    public List<ReviewDTO> checkUserLikedReview(User user){
//        Product product = new Product();
//        return product.getReviews().stream()
//                .map(rev -> {
//                    /* way to fix the many to many */
//                    Optional<ReviewLikedUser> optionalResult = reviewLikedUserRepository.findByUserAndReview(user, rev);
//                    ReviewDTO dto = new ReviewDTO();
//                    dto.setLike(optionalResult.isPresent());
//                    return dto;
//                })
//                .collect(Collectors.toList());
//    }

}
