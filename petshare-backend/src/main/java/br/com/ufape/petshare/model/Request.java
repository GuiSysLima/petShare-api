package br.com.ufape.petshare.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.ufape.petshare.model.enums.RequestStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double receivedQuantity;
    private Double quantity;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;
    
    
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private Item item;
    
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "post_id")
	private Post post;
    
    @OneToMany(mappedBy = "request", orphanRemoval = true)
	private List<ReceivedItem> receivedItems;
    
    public Request(Long id, Double receivedQuantity, Double quantity, RequestStatus status, LocalDate date, User user,
			Item item, Post post) {
		super();
		this.id = id;
		this.receivedQuantity = receivedQuantity;
		this.quantity = quantity;
		this.status = status;
		this.date = date;
		this.user = user;
		this.item = item;
		this.post = post;
		this.receivedItems = new ArrayList<>();
	}
    
    public void addReceivedQuantity(Double quantity) {
    	this.receivedQuantity += quantity;
    }

}