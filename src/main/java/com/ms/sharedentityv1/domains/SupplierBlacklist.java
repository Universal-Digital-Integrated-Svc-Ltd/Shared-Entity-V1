package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "supplier_blacklist")
@NoArgsConstructor
@Getter
@Setter
public class SupplierBlacklist {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "pan_no")
	private String panNo;

	@Column(name = "gst_no")
	private String gstNo;

	@Column(name = "attempts")
	private Long attempts;

	@Column(name = "blacklist")
	private Boolean blacklist;

	@Column(name = "bank_account_name")
	private String bankAccountName;

	@Column(name = "bank_account_number")
	private String bankAccountNumber;

	@Column(name = "bank_ifsc")
	private String bankIfsc;

	@Column(name = "bank_name")
	private String bankName;


}
