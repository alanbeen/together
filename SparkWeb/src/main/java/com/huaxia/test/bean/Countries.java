package com.huaxia.test.bean;
// Generated 2017-2-27 17:02:28 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Countries generated by hbm2java
 */
@Entity
@Table(name="countries"
    ,catalog="test"
)
public class Countries  implements java.io.Serializable {


     private CountriesId id;

    public Countries() {
    }

    public Countries(CountriesId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="code", column=@Column(name="code", nullable=false, length=2) ), 
        @AttributeOverride(name="year", column=@Column(name="year", nullable=false) ), 
        @AttributeOverride(name="gdpPerCapita", column=@Column(name="gdp_per_capita", nullable=false, precision=10) ), 
        @AttributeOverride(name="govtDebt", column=@Column(name="govt_debt", nullable=false, precision=10) ) } )
    public CountriesId getId() {
        return this.id;
    }
    
    public void setId(CountriesId id) {
        this.id = id;
    }




}


