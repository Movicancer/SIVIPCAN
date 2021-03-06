package ni.gob.minsa.modelo.estructura;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name="REGIMENES", schema="GENERAL")
public class Regimen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REGIMENES_REGIMENID_GENERATOR", sequenceName="REGIMENES_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REGIMENES_REGIMENID_GENERATOR")
	@Column(name="REGIMEN_ID", updatable=false)
	private long regimenId;

	private BigDecimal codigo;

	private String nombre;

	private String pasivo;

    public Regimen() {
    }

	public long getRegimenId() {
		return this.regimenId;
	}

	public void setRegimenId(long regimenId) {
		this.regimenId = regimenId;
	}

	public BigDecimal getCodigo() {
		return this.codigo;
	}

	public void setCodigo(BigDecimal codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPasivo() {
		return this.pasivo;
	}

	public void setPasivo(String pasivo) {
		this.pasivo = pasivo;
	}

}