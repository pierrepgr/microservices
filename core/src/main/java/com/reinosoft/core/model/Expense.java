package com.reinosoft.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AttributeOverrides({
        @AttributeOverride(name = "typeMovement", column = @Column(nullable = false)),
        @AttributeOverride(name = "value", column = @Column(nullable = false)),
        @AttributeOverride(name = "description", column = @Column(nullable = false))
})
public class Expense extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -6258014469359911481L;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
