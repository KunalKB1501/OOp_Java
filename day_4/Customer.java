
	package utility;

	import java.time.LocalDate;

import com.app.customer.Serviceplan;

	public class Customer {
		private static int id;
		private int custid;
		private String name, lastname, email, password;
		private double regamount;
		private LocalDate dob;
		private Serviceplan splan;

		static {
			id = 3200;
		}

		// initilize two ctor
		// one for all arguments
		// one for primary key
		public Customer(String name, String lastname, String email, String password,Serviceplan splan , LocalDate dob,
				double regamount) {
			super();
			this.custid = id;
			id++;
			this.name = name;
			this.lastname = lastname;
			this.email = email;
			this.password = password;
			this.regamount = regamount;
			this.dob = dob;
			this.splan = splan;
		}

		// customer for primary key
		public Customer(String email) {
			super();
			this.email = email;
		}

		@Override
		public String toString() {
			return "Customer :\ncustid=" + custid + ", name=" + name + ", lastname=" + lastname + "\n Email=" + email + ", password="
					+ password + "\n regamount=" + regamount + ", dob=" + dob + ", serviceplan=" + splan + "]";
		}

		public Customer(String email, String password) {
			super();
			this.email = email;
			this.password = password;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		@Override
		public boolean equals(Object o) {
			System.out.println("check duplicate email");
			// check whether email is repeated or not
			// but object is parent class to customer so downcast and check check condition
			if (o instanceof Customer)
				return this.email.equals(((Customer) o).email);
			return false;

		}

	}


