package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "wish_list_item")
@NoArgsConstructor
@Getter
@Setter
public class WishListItem {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "reseller_id")
    private Long resellerId;

    @Column(name = "product_id")
    private Long productId;


}
