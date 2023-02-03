package com.groupe8.model;
// Generated 31 janv. 2023, 09:27:01 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Commande generated by hbm2java
 */
@Entity
@Table(name = "commande", catalog = "bd_groupe8")
public class Commande implements java.io.Serializable {

	private Integer commandeId;
	private Client client;
	private Gerant gerant;
	private Livreur livreur;
	private Date dateCommande;
	private Date dateRecuperation;
	private Float coutTotalCommande;
	private float coutAvance;
	private String statut;
	private String lieuRecuperation;
	private Set<Produit> produits = new HashSet<Produit>(0);

	public Commande() {
	}

	public Commande(Client client, Gerant gerant, Livreur livreur, Date dateCommande, float coutAvance, String statut) {
		this.client = client;
		this.gerant = gerant;
		this.livreur = livreur;
		this.dateCommande = dateCommande;
		this.coutAvance = coutAvance;
		this.statut = statut;
	}

	public Commande(Client client, Gerant gerant, Livreur livreur, Date dateCommande, Date dateRecuperation,
			Float coutTotalCommande, float coutAvance, String statut, String lieuRecuperation, Set<Produit> produits) {
		this.client = client;
		this.gerant = gerant;
		this.livreur = livreur;
		this.dateCommande = dateCommande;
		this.dateRecuperation = dateRecuperation;
		this.coutTotalCommande = coutTotalCommande;
		this.coutAvance = coutAvance;
		this.statut = statut;
		this.lieuRecuperation = lieuRecuperation;
		this.produits = produits;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "COMMANDE_ID", unique = true, nullable = false)
	public Integer getCommandeId() {
		return this.commandeId;
	}

	public void setCommandeId(Integer commandeId) {
		this.commandeId = commandeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENT_ID", nullable = false)
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GERANT_ID", nullable = false)
	public Gerant getGerant() {
		return this.gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LIVREUR_ID", nullable = false)
	public Livreur getLivreur() {
		return this.livreur;
	}

	public void setLivreur(Livreur livreur) {
		this.livreur = livreur;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_COMMANDE", nullable = false, length = 10)
	public Date getDateCommande() {
		return this.dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_RECUPERATION", length = 10)
	public Date getDateRecuperation() {
		return this.dateRecuperation;
	}

	public void setDateRecuperation(Date dateRecuperation) {
		this.dateRecuperation = dateRecuperation;
	}

	@Column(name = "COUT_TOTAL_COMMANDE", precision = 8)
	public Float getCoutTotalCommande() {
		return this.coutTotalCommande;
	}

	public void setCoutTotalCommande(Float coutTotalCommande) {
		this.coutTotalCommande = coutTotalCommande;
	}

	@Column(name = "COUT_AVANCE", nullable = false, precision = 8)
	public float getCoutAvance() {
		return this.coutAvance;
	}

	public void setCoutAvance(float coutAvance) {
		this.coutAvance = coutAvance;
	}

	@Column(name = "STATUT", nullable = false, length = 15)
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@Column(name = "LIEU_RECUPERATION", length = 30)
	public String getLieuRecuperation() {
		return this.lieuRecuperation;
	}

	public void setLieuRecuperation(String lieuRecuperation) {
		this.lieuRecuperation = lieuRecuperation;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "commandes")
	public Set<Produit> getProduits() {
		return this.produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

}