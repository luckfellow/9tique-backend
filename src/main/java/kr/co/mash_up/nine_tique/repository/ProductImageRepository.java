package kr.co.mash_up.nine_tique.repository;

import kr.co.mash_up.nine_tique.domain.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
}
