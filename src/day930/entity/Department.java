package day930.entity;

/**
 * 
 * 部门实体类
 * @author JF-001
 *
 */
public class Department {

	private Integer id;//部门ID
	private String deName;//部门名
	private Integer maxPeople;//最多人数
	private String deAddress;//部门位置
	public Department(Integer id, String deName, Integer maxPeople, String deAddress) {
		super();
		this.id = id;
		this.deName = deName;
		this.maxPeople = maxPeople;
		this.deAddress = deAddress;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeName() {
		return deName;
	}
	public void setDeName(String deName) {
		this.deName = deName;
	}
	public Integer getMaxPeople() {
		return maxPeople;
	}
	public void setMaxPeople(Integer maxPeople) {
		this.maxPeople = maxPeople;
	}
	public String getDeAddress() {
		return deAddress;
	}
	public void setDeAddress(String deAddress) {
		this.deAddress = deAddress;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", deName=" + deName + ", maxPeople=" + maxPeople + ", deAddress=" + deAddress
				+ "]";
	}
	
	
	
	
	
}
