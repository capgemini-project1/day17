package Day15demo3jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Day15demo3jpa.Employee;

public class MAIN {
	public static void main(String[] args) {
			//createRecord();
			//readRecord();
			//udpateRecord();
			deleteRecord();
		}
		
		
		public static void deleteRecord() {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("myjpa");
			EntityManager entityManager =  factory.createEntityManager();
			
			
			
			Employee employee =  entityManager.find(Employee.class,400);
			entityManager.getTransaction().begin();
			entityManager.remove(employee); 
			entityManager.getTransaction().commit();
			System.out.println("Deleted successfully");
		}
		
		
		public static void udpateRecord() {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("myjpa");
			EntityManager entityManager =  factory.createEntityManager();
			
		
			Employee employee =  entityManager.find(Employee.class, 99);
			

			 employee.setEmail("ravi@gmail.com");
			 employee.setMobile("990866089");
			employee.setSalary(10000.0);
			
			
			// update
			entityManager.getTransaction().begin();
			entityManager.merge(employee);
			entityManager.getTransaction().commit();
			System.out.println("Record updated");
		}
		
		
		public static void readRecord() {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("myjpa");
			EntityManager entityManager =  factory.createEntityManager();
			
			Employee emp = entityManager.find(Employee.class, 400);
			emp.getEmail();
			emp.getMobile();
			emp.getSalary();
			System.out.println(emp);
			}
		

		public static void createRecord() {
		
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("myjpa");
			EntityManager entityManager =  factory.createEntityManager();
			
			
			Employee employee = new Employee();
			employee.setId(15);
			employee.setName("sunil");
			employee.setEmail("sunil@gmail.com");
			employee.setMobile("77290488");
			employee.setSalary(10000);
			
			entityManager.getTransaction().begin();
			
			entityManager.persist(employee);
			
			entityManager.getTransaction().commit();
			
			 //entityManager.getTransaction().rollback();
			
			System.out.println("Employee Added!!");
		}
	}


