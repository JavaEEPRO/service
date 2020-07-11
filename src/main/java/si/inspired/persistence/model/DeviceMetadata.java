package si.inspired.persistence.model;

import si.inspired.persistence.model.abstractModel.AbstractBaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "svc_device_metadata")
public class DeviceMetadata extends AbstractBaseEntity {

    private Long userId;
    private String deviceDetails;
    private String location;
    private Date lastLoggedIn;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDeviceDetails() {
        return deviceDetails;
    }

    public void setDeviceDetails(String deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getLastLoggedIn() {
        return lastLoggedIn;
    }

    public void setLastLoggedIn(Date lastLoggedIn) {
        this.lastLoggedIn = lastLoggedIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceMetadata that = (DeviceMetadata) o;
        return Objects.equals(this.getId(), that.getId()) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(deviceDetails, that.deviceDetails) &&
                Objects.equals(location, that.location) &&
                Objects.equals(lastLoggedIn, that.lastLoggedIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), userId, deviceDetails, location, lastLoggedIn);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeviceMetadata{");
        sb.append("id=").append(this.getId());
        sb.append(", userId=").append(userId);
        sb.append(", deviceDetails='").append(deviceDetails).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", lastLoggedIn=").append(lastLoggedIn);
        sb.append('}');
        return sb.toString();
    }
}