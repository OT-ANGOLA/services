package org.sola.cs.services.ejb.refdata.entities;

import javax.persistence.Column;
import javax.persistence.Table;
import org.sola.services.common.repository.DefaultSorter;
import org.sola.services.common.repository.entities.AbstractCodeEntity;

@Table(name = "province", schema = "address")
@DefaultSorter(sortString="display_value")
public class Province extends AbstractCodeEntity {
    @Column(name = "country_code")
    private String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    public Province(){
        super();
    }
}