package hibernateproject;
import javax.persistence.*

@Entity
@Table(name=proj)

public class proj {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String name;
	
	public Student() {}
	public Student(String name) {
		this.name = name;
	}
	
	

}
