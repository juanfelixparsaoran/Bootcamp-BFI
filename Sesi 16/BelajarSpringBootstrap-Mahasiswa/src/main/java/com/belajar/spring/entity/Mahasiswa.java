package com.belajar.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "mahasiswa")
public class Mahasiswa {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	public String id;

	@NotNull
	@NotBlank
	@Column(unique = true, name="nim")
	public String nim;

	@NotNull
	@NotBlank
	@Column(unique = true, name = "nama")
	public String nama;

	@Column(name = "ipk")
	public float ipk;

	@NotNull
	@NotBlank
	@Column(name = "jurusan")
	public String jurusan;

}
