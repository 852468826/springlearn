package lcm.spring.action;

/**
 * ������
 * @author aaaaa
 *
 */
public class Dao{

	
	private Idao idao; 
	
	public Idao getIdao() {
		return idao;
	}

	public Dao(Idao idao) {
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
