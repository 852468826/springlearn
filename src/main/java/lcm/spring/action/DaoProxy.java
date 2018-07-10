package lcm.spring.action;

/**
 * ¥˙¿Ì¿‡
 * @author aaaaa
 *
 */
public class DaoProxy{

	
	private Idao idao; 
	
	public Idao getIdao() {
		return idao;
	}

	public DaoProxy(Idao idao) {
		super();
		this.idao = idao;
	}

	public void setIdao(Idao idao) {
		this.idao = idao;
	}

	public void getData() {
		
		idao.getData();
	}

	
	
}
