package si.inspired.persistence.model;

import si.inspired.persistence.model.abstractModel.AbstractBaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "svc_new_location_token")
public class NewLocationToken extends AbstractBaseEntity {

    private String token;

    @OneToOne(targetEntity = UserLocation.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_location_id")
    private UserLocation userLocation;

    //

    public NewLocationToken() {
        super();
    }

    public NewLocationToken(final String token) {
        super();
        this.token = token;
    }

    public NewLocationToken(final String token, final UserLocation userLocation) {
        super();
        this.token = token;
        this.userLocation = userLocation;
    }

    //

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserLocation getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(UserLocation userLocation) {
        this.userLocation = userLocation;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((this.getId() == null) ? 0 : this.getId().hashCode());
        result = (prime * result) + ((token == null) ? 0 : token.hashCode());
        result = (prime * result) + ((userLocation == null) ? 0 : userLocation.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NewLocationToken other = (NewLocationToken) obj;
        if (this.getId() == null) {
            if (other.getId() != null) {
                return false;
            }
        } else if (!this.getId().equals(other.getId())) {
            return false;
        }
        if (token == null) {
            if (other.token != null) {
                return false;
            }
        } else if (!token.equals(other.token)) {
            return false;
        }
        if (userLocation == null) {
            if (other.userLocation != null) {
                return false;
            }
        } else if (!userLocation.equals(other.userLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewLocationToken [id=" + this.getId() + ", token=" + token + ", userLocation=" + userLocation + "]";
    }

}

