package ca.alisina.ForgetLens.Repo;

import ca.alisina.ForgetLens.Domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
    public Optional<Item> findById(String id);
}
