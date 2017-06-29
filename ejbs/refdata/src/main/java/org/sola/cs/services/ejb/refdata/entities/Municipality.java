package org.sola.cs.services.ejb.refdata.entities;

import javax.persistence.Column;
import javax.persistence.Table;
import org.sola.services.common.repository.DefaultSorter;
import org.sola.services.common.repository.entities.AbstractCodeEntity;

@Table(name = "municipality", schema = "address")
@DefaultSorter(sortString="display_value")
public class Municipality extends AbstractCodeEntity {
    @Column(name = "province_code")
    private String provinceCode;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Municipality(){
        super();
    }
}