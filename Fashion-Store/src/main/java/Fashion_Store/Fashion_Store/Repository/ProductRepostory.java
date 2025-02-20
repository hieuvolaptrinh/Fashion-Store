package Fashion_Store.Fashion_Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Fashion_Store.Fashion_Store.Model.SanPham;

@Repository
public interface ProductRepostory extends JpaRepository<SanPham, Long> {

}
