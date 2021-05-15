package Day15demo1jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
		@Id
		int id;
		String name;
		String email;
		String mobile;
		int salary;
		
		

		public Employee() {
			super();
		}

		
		
		public Employee(int id, String name, String email, String mobile, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.mobile = mobile;
			this.salary = salary;
		}



		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}



		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}

		
		
	}

