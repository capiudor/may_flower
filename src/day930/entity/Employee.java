package day930.entity;

/**
 * 
 * 员工的实体类
 * @author JF-001
 *
 */
public class Employee {
	
	private Integer departmentID;//部门ID
	private String realName;//员工姓名
	private String gender;//员工性别
	private String age;//员工年龄
	private String mobile;//联系电话
	private String address;//家庭住址
	public Employee(Integer departmentID, String realName, String gender, String age, String mobile, String address) {
		super();
		this.departmentID = departmentID;
		this.realName = realName;
		this.gender = gender;
		this.age = age;
		this.mobile = mobile;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	@Override
	public String toString() {
		return "Employee [departmentID=" + departmentID + ", realName=" + realName + ", gender=" + gender + ", age="
				+ age + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	
	
}
