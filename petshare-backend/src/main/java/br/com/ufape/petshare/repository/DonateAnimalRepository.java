package br.com.ufape.petshare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufape.petshare.model.DonateAnimal;
import br.com.ufape.petshare.model.enums.DonationStatus;

@Repository
public interface DonateAnimalRepository extends JpaRepository<DonateAnimal, Long> {
	List<DonateAnimal> findByStatus(DonationStatus status);

	List<DonateAnimal> findByDonorId(Long donorId);
}