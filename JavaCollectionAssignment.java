package com.hcl.JavaCollectionAssignment;

import java.util.Set;

public class JavaCollectionAssignment {

	public static void main(String[] args) {
		Set<String> patientSet = new LinkedHashSet<>();
		patientSet.add("12345");
		patientSet.add("Christopher R");
		patientSet.add("90");
		System.out.println("Patient ID, Name, Age" + patientSet);

		Set<String> doctorSet = new LinkedHashSet<>();
		doctorSet.add("98765");
		doctorSet.add("John D");
		doctorSet.add("Emergency medicine");
		System.out.println("Doctor ID, Name, Specialty" + doctorSet);

	}

}
