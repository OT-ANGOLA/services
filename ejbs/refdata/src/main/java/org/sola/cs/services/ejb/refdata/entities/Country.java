package org.sola.cs.services.ejb.refdata.entities;

import javax.persistence.Table;
import org.sola.services.common.repository.DefaultSorter;
import org.sola.services.common.repository.entities.AbstractCodeEntity;

@Table(name = "country", schema = "address")
@DefaultSorter(sortString="display_value")
public class Country extends AbstractCodeEntity {
    public Country(){
        super();
    }
}