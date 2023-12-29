package repository;

import entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository extends JpaRepository<Order,Long> {

}
