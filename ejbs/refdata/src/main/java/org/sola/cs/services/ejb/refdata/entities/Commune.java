package org.sola.cs.services.ejb.refdata.entities;

import javax.persistence.Column;
import javax.persistence.Table;
import org.sola.services.common.repository.DefaultSorter;
import org.sola.services.common.repository.entities.AbstractCodeEntity;

@Table(name = "commune", schema = "address")
@DefaultSorter(sortString="display_value")
public class Commune extends AbstractCodeEntity {
    @Column(name = "municipality_code")
    private String municipalityCode;

    public String getMunicipalityCode() {
        return municipalityCode;
    }

    public void setMunicipalityCode(String municipalityCode) {
        this.municipalityCode = municipalityCode;
    }

    public Commune(){
        super();
    }
}