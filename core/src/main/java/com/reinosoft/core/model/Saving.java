package com.reinosoft.core.model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AttributeOverrides({
        @AttributeOverride(name = "typeMovement", column = @Column(nullable = false)),
        @AttributeOverride(name = "value", column = @Column(nullable = false)),
        @AttributeOverride(name = "description", column = @Column(nullable = false))
})
public class Saving extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -1711325121051720304L;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
