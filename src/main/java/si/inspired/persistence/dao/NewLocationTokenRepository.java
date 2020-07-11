package si.inspired.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import si.inspired.persistence.model.NewLocationToken;
import si.inspired.persistence.model.UserLocation;

public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {

    NewLocationToken findByToken(String token);

    NewLocationToken findByUserLocation(UserLocation userLocation);

}