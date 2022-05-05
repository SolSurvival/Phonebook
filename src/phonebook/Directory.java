package phonebook;

import java.util.*;

public class Directory {
	
	public static Directory directory = new Directory();
	
	Person[] person = new Person[0]; 
	
	Address[] address = new Address[0];
	
	// addPerson to array
	public void addPerson(Person newPerson) {
		// create temp array one larger than current array
		Person[] temp = new Person[person.length + 1];
		
		//add people in original array to temp array
		for(int i = 0; i < person.length; i++) {
			temp[i] = person[i];
			
		}
		//at end of array, add new person object
		temp[temp.length - 1] = newPerson;
		
		// reassign the original array to temp 
		person = temp;
		
	}
	
	public Person[] getDirectory() {
		return person;
	}	
	
	public Address[] getDirectory2() {
		return address;
	}
	
	// to print entire directory
	public void printDirectory(Person[] people) {
		for(int i = 0; i < people.length; i++) {
			people[i].getPerson();
		}
	}
	
	public void printDirectoryArray(Person[] searched) {
		for(int i = 0; i < searched.length; i++) {
			searched[i].getAddress();
		}
	}
	
	public void printDirectoryArray2(Person[] searched) {
		for(int i = 0; i < searched.length; i++) {
			searched[i].getAddress();
		}
	}
	
	public Person[] findFirstName(String entry) {

		int count = 0;
		for (int i = 0; i < person.length; i++) {
			if (person[i].getFirstName().equals(entry)) {
				count++;
			}
		}
		Person[] tempArr = new Person[count];

		int x = 0;
		for (int i = 0; i < person.length; i++) {
			if (person[i].getFirstName().equals(entry)) {
				tempArr[x] = person[i];
				x++;

			}
		}
		return tempArr;
	}
	
	public Person[] findLastName(String entry) {
		
		int count = 0;
		for(int i = 0; i < person.length; i++) {
			if(person[i].getLastName().equals(entry)) {
				count++;
			}
		}
		Person[] tempArr = new Person[count];
		
		int x=0; 
		for(int i = 0; i < person.length; i++) {
			if(person[i].getLastName().equals(entry)) {
				tempArr[x] = person[i];
				x++;
			}
		}
		return tempArr;
	}
	
	public Person[] findFullName(String entry) {

		int count = 0;
		for (int i = 0; i < person.length; i++) {
			if ((person[i].getFirstName() + " " + person[i].getLastName()).equals(entry)) {
				count++;
			}
		}
		Person[] tempArr = new Person[count];

		int x = 0;
		for (int i = 0; i < person.length; i++) {
			if ((person[i].getFirstName() + " " + person[i].getLastName()).equals(entry)) {
				tempArr[x] = person[i];
				x++;

			}
		}
		return tempArr;
	}
	
	public Person[] findPhone(Long phone) {

		int count = 0;
		for (int i = 0; i < person.length; i++) {
			if (person[i].getPhone().equals(phone)) {
				count++;
			}
		}
		Person[] tempArr = new Person[count];

		int x = 0;
		for (int i = 0; i < person.length; i++) {
			if (person[i].getPhone().equals(phone)) {
				tempArr[x] = person[i];
				x++;

			}
		}
		return tempArr;
	}	
	
	public Address[] findCity(String city) {

		int count = 0;
		for (int i = 0; i < address.length; i++) {
			if (address[i].getCity().equals(city)) {
				count++;
			}
		}
		Address[] tempArr = new Address[count];

		int x = 0;
		for (int i = 0; i < address.length; i++) {
			if (address[i].getCity().equals(city)) {
				tempArr[x] = address[i];
				x++;

			}
		}
		return tempArr;
	}	

	public Address[] findState(String state) {

		int count = 0;
		for (int i = 0; i < address.length; i++) {
			if (address[i].getState().equals(state)) {
				count++;
			}
		}
		Address[] tempArr = new Address[count];

		int x = 0;
		for (int i = 0; i < address.length; i++) {
			if (address[i].getState().equals(state)) {
				tempArr[x] = address[i];
				x++;

			}
		}
		return tempArr;
	}	
	
}