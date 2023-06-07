package com.telusko.springbootwebproject;

import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{

}
