package kr.co.tiggle.jpa.repository;

import kr.co.tiggle.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface T_DonationRepository extends JpaRepository<User, Integer> {

}
