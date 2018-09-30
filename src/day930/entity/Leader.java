package day930.entity;

/**
 * 
 *  领导的实体类
 * @author JF-001
 *
 */
public class Leader {

	private Integer departmentID;//部门ID
	private String realname;//真实姓名
	private String sex;//性别
	private String age;//年龄
	private String mobile;//电话
	private String address;//联系地址
	private String username;//登录名
	private String password;//登录密码
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
		System.out.println("leader有参构造方法进来了！！！");
	}
	public Leader() {
		super();
		System.out.println("leader空构造方法进来了！！！");
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
