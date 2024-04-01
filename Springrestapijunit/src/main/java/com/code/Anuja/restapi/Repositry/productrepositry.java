package com.code.Anuja.restapi.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.Anuja.restapi.Entity.Product;

public interface productrepositry  extends JpaRepository<Product,Long>{

}
