package com.reinosoft.core.model;

import com.reinosoft.core.enums.TypeMovement;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 6051344086529399344L;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private TypeMovement typeMovement;
    @Column(nullable = false)
    private BigDecimal value;
    @NotBlank(message = "The field description is mandatory")
    @Column(nullable = false)
    private String description;

}
