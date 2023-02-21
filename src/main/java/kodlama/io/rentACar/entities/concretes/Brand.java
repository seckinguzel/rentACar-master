package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
	
	@Id //Id annotation says, you are a primary key in data base.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Id automatic increases.
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
}
