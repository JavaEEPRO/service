package si.inspired.persistence.model.abstractModel;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class AbstractBaseEntity implements Serializable {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.id == null;
    }
}
