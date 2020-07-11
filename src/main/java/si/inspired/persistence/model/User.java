package si.inspired.persistence.model;

import org.jboss.aerogear.security.otp.api.Base32;
import si.inspired.persistence.model.abstractModel.AbstractUserEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "svc_user_account")
public class User extends AbstractUserEntity {

    public User() {
        super();
        this.setSecret(Base32.random());
        this.setEnabled(false);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}