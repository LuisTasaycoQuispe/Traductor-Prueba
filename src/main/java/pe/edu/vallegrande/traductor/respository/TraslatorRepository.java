package pe.edu.vallegrande.traductor.respository;

import org.springframework.data.r2dbc.repository.Modifying;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import pe.edu.vallegrande.traductor.model.Traslator;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TraslatorRepository extends ReactiveCrudRepository<Traslator, Long> {
    Flux<Traslator> findAllByState(String state);

	@Modifying
	@Query("update translations set state = 'I' where id = :id")
	Mono<Void> inactiveTranslation(Long id);

	@Modifying
	@Query("update translations set state = 'A' where id = :id")
	Mono<Void> activeTranslation(Long id);

	Mono<Traslator> findTopByOrderByIdDesc();
    
}
