package com.gl.CaseStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gl.CaseStudy.bean.Offer;
public interface OfferRepository extends JpaRepository<Offer, Long> {

}
