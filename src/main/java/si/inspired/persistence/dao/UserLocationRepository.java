package si.inspired.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import si.inspired.persistence.model.User;
import si.inspired.persistence.model.UserLocation;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}