package org.codebone.security.authorities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.codebone.framework.generic.AbstractModel;


@Entity
@Table
public class Authorities extends AbstractModel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Long idx;
	
	@Column
	private Long organizationIdx;
	
	@Column
	private String authority;

	public Long getIdx() {
		return idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public Long getOrganizationIdx() {
		return organizationIdx;
	}

	public void setOrganizationIdx(Long organizationIdx) {
		this.organizationIdx = organizationIdx;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Authorities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Authorities(Date createdDate, Date updatedDate) {
		super(createdDate, updatedDate);
		// TODO Auto-generated constructor stub
	}

	public Authorities(Date createdDate, Date updatedDate, Long idx,
			Long organizationIdx, String authority) {
		super(createdDate, updatedDate);
		this.idx = idx;
		this.organizationIdx = organizationIdx;
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "AuthoritiesModel [idx=" + idx + ", organizationIdx=" + organizationIdx
				+ ", authority=" + authority + "]";
	}
}
