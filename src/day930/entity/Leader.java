package day930.entity;

/**
 * 
 *  �쵼��ʵ����
 * @author JF-001
 *
 */
public class Leader {

	private Integer departmentID;//����ID
	private String realname;//��ʵ����
	private String sex;//�Ա�
	private String age;//����
	private String mobile;//�绰
	private String address;//��ϵ��ַ
	private String username;//��¼��
	private String password;//��¼����
	public Leader(Integer departmentID, String realname, String sex, String age, String mobile, String address,
			String username, String password) {
		super();
		this.departmentID = departmentID;
		this.realname = realname;
		this.sex = sex;
		this.age = age;
		this.mobile = mobile;
		this.address = address;
		this.username = username;
		this.password = password;
		System.out.println("leader�вι��췽�������ˣ�����");
	}
	public Leader() {
		super();
		System.out.println("leader�չ��췽�������ˣ�����");
		// TODO Auto-generated constructor stub
	}
	public Integer getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Leader [departmentID=" + departmentID + ", realname=" + realname + ", sex=" + sex + ", age=" + age
				+ ", mobile=" + mobile + ", address=" + address + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
