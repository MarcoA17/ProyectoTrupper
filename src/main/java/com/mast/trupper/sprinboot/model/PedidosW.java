package com.mast.trupper.sprinboot.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pedidos_w")
public class PedidosW implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private BigDecimal total;

	@Column(name = "date_sale")
	@Temporal(TemporalType.DATE)
	private Date date_sale;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Date getDate_sale() {
		return date_sale;
	}

	public void setDate_sale(Date date_sale) {
		this.date_sale = date_sale;
	}

	@Override
	public String toString() {
		return "PedidosW [id=" + id + ", total=" + total + ", date_sale=" + date_sale + "]";
	}

}
