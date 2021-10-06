package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.brewer.model.Cerveja;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, String>{
	
	Optional<Cerveja> findBySku(String sku);
}